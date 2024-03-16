package net.nukollodda.tekora.block.fluids;

import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FlowingFluid;
import net.nukollodda.tekora.fluid.TekoraChemicalFluidType;
import net.nukollodda.tekora.fluid.data.TekoraFluidData;
import net.nukollodda.tekora.item.isotopic.radioactive.AbstractRadioactiveItem;
import net.nukollodda.tekora.util.FluidFunctions;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.Supplier;

public abstract class AbstractTekoraFluidBlock extends LiquidBlock {
    public AbstractTekoraFluidBlock(Supplier<? extends FlowingFluid> pFluid, Properties pProperties) {
        super(pFluid, pProperties.noLootTable());
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable BlockGetter pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
        if (getFluid().getFluidType() instanceof TekoraChemicalFluidType type) {
            pTooltip.add(Component.translatable("tooltip.tekora.hazard_values")
                    .append(":").withStyle(ChatFormatting.GRAY));
            pTooltip.add(Component.literal("   ").append(Component.translatable("tooltip.tekora.health_hazard"))
                    .append(": " + type.getFluidDmg()).withStyle(ChatFormatting.BLUE));
            pTooltip.add(Component.literal("   ").append(Component.translatable("tooltip.tekora.flammability"))
                    .append(": " + type.getFluidData().getBurnability()).withStyle(ChatFormatting.RED));
            pTooltip.add(Component.literal("   ").append(Component.translatable("tooltip.tekora.reactivity")
                    .append(": " + getReactivityValue(type)).withStyle(ChatFormatting.YELLOW)));

            pTooltip.add(Component.translatable("tooltip.tekora.melting_point")
                    .append(FluidFunctions.getDisplayedTemperature(type.getMeltingPoint())).withStyle(ChatFormatting.GRAY));
            pTooltip.add(Component.translatable("tooltip.tekora.heat_of_fusion")
                    .append(": " + type.getFusionHeat()).append("J/L").withStyle(ChatFormatting.GRAY));
            pTooltip.add(Component.translatable("tooltip.tekora.heat_of_vaporization")
                    .append(": " + type.getVaporizationHeat()).append("J/L").withStyle(ChatFormatting.GRAY));
            pTooltip.add(Component.translatable("tooltip.tekora.specific_heat")
                    .append(": " + type.getSpecificHeat()).append("J/L K").withStyle(ChatFormatting.GRAY));

            float radiation = type.getRadioactivity();
            if (radiation > 0) {
                pTooltip.add(Component.translatable("msg.tekora.rad").append(":"));
                pTooltip.add(AbstractRadioactiveItem.radComponent(radiation));
            }
        }
        super.appendHoverText(pStack, pLevel, pTooltip, pFlag);
    }

    @Override
    public void entityInside(BlockState pState, Level pLevel, BlockPos pPos, Entity pEntity) {
        if (pEntity instanceof LivingEntity living) {
            if (this.getFluid().getFluidType() instanceof TekoraChemicalFluidType tekoraFluid) {
                TekoraFluidData data = tekoraFluid.getFluidData();
                ResourceKey<Level> dimension = pLevel.dimension();

                float pressure = 1;
                if (dimension.equals(Level.END)) pressure = 0.895f;
                else if (dimension.equals(Level.NETHER)) pressure = 1.121f;

                if (data.getEffects() != null) {
                    for (MobEffect effect : data.getEffects()) {
                        living.addEffect(new MobEffectInstance(effect, 200, (int) Math.pow(pressure - 1, 2) - 1,
                                true, false, false));
                    }
                }
                if (data.getFluidDmg() > 0) {
                    living.hurt(living.level().damageSources().generic(), data.getFluidDmg());
                }
                if (data.getMeltingPoint() > 700) {
                    living.setSecondsOnFire((int) data.getMeltingPoint() / 200);
                }
            } else {
                if (this.getFluid().getFluidType().getTemperature() > 700) {
                    living.setSecondsOnFire(this.getFluid().getFluidType().getTemperature() / 200);
                }
            }
        }
        super.entityInside(pState, pLevel, pPos, pEntity);
    }

    private byte getReactivityValue(TekoraChemicalFluidType pType) {
        return (byte)Math.round(pType.getReactivity());
    }
}
