package net.tekoramods.tekora.item.tools.thorium;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.tekoramods.tekora.item.IRadioactiveItems;
import net.tekoramods.tekora.item.isotopic.radioactive.Thorium;
import net.tekoramods.tekora.item.tools.TekoraHoeItem;
import net.tekoramods.tekora.item.typical.RawItem;
import net.tekoramods.tekora.tiers.TekoraTiers;
import org.jetbrains.annotations.NotNull;

public class ThoriumHoe extends TekoraHoeItem implements IRadioactiveItems {
    public ThoriumHoe() {
        super(TekoraTiers.THORIUM, -3, 0, true, RawItem.THORIUM);
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


    @Override
    public double getRadiation(ItemStack pStack) {
        return Thorium.Isotopes.TH232.getRadiationVal();
    }
}
