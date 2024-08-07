package net.tekoramods.tekora.item.tools;

import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;

public class TekoraPickaxeItem extends PickaxeItem implements ITekoraColored {
    private final int color;

    public TekoraPickaxeItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, boolean pFireRes, int pColor) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pFireRes ? new Properties().fireResistant() : new Properties());
        this.color = pColor;
    }

    public TekoraPickaxeItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, int pColor) {
        this(pTier, pAttackDamageModifier, pAttackSpeedModifier, false, pColor);
    }

    @Override
    public int getColor() {
        return color;
    }
}
