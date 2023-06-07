package net.nukollodda.tekora.item.tools.thorium;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.nukollodda.tekora.item.tools.RadioactiveTools;
import net.nukollodda.tekora.tiers.ModTiers;
import org.jetbrains.annotations.NotNull;

public class ThoriumHoe extends HoeItem implements RadioactiveTools {
    public ThoriumHoe() {
        super(ModTiers.THORIUM, -3, 0, new Item.Properties().fireResistant().tab(CreativeModeTab.TAB_TOOLS));
    }

    @Override
    public boolean hurtEnemy(ItemStack pStack, @NotNull LivingEntity pTarget, @NotNull LivingEntity pAttacker) {
        pStack.hurtAndBreak(1, pTarget, i -> i.broadcastBreakEvent(EquipmentSlot.MAINHAND));
        pTarget.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 300, 0, true, false, false));
        pTarget.addEffect(new MobEffectInstance(MobEffects.WITHER, 600, 0, true, false, false));
        pTarget.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 1050, 0, true, false, false));
        pTarget.addEffect(new MobEffectInstance(MobEffects.HUNGER, 1350, 0, true, false, false));
        pTarget.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 1500, 0, true, false, false));
        pTarget.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 1500, 0, true, false, false));
        return true;
    } // note, there needs to be code that would also make the soil grow poisonous variants of food instead of the regular,
      // maybe this could be re-added in BioTekora
}
