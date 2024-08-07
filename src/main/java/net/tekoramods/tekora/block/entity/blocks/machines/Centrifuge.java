package net.tekoramods.tekora.block.entity.blocks.machines;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraftforge.network.NetworkHooks;
import net.tekoramods.tekora.block.entity.entities.TekoraBlockEntities;
import net.tekoramods.tekora.block.entity.entities.machines.CentrifugeEntity;
import org.jetbrains.annotations.Nullable;

public class Centrifuge extends AbstractElectricMachineBlock {
    public Centrifuge() {
        super(6f);
    }

    @Override
    public InteractionResult use(BlockState state, Level lvl, BlockPos pos,
                                 Player player, InteractionHand hand, BlockHitResult hit) {
        if (!lvl.isClientSide()) {
            BlockEntity entity = lvl.getBlockEntity(pos);
            if (entity instanceof CentrifugeEntity ent) {
                NetworkHooks.openScreen(((ServerPlayer) player), ent, pos);
            } else {
                throw new IllegalStateException("Container Provider is missing");
            }
        }
        return InteractionResult.sidedSuccess(lvl.isClientSide);
    }

    @Override
    public void onRemove(BlockState state, Level lvl, BlockPos pos, BlockState newState, boolean isMoving) {
        if (state.getBlock() != newState.getBlock()) {
            BlockEntity blockEnt = lvl.getBlockEntity(pos);
            if (blockEnt instanceof CentrifugeEntity ent) {
                ent.drops(); // drops all the contents
            }
        }

        super.onRemove(state,lvl,pos,newState,isMoving);
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new CentrifugeEntity(pPos, pState); // should find a way to autogenerate recipes
    }
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level lvl, BlockState state,
                                                                  BlockEntityType<T> type) {
        return createTickerHelper(type, TekoraBlockEntities.CENTRIFUGE.get(),
                CentrifugeEntity::tick);
    }
}
