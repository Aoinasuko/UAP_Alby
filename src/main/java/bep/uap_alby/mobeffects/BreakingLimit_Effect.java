package bep.uap_alby.mobeffects;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;

public class BreakingLimit_Effect extends MobEffect {
    public BreakingLimit_Effect(MobEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public void applyEffectTick(LivingEntity livingentity, int amplifier) {
        livingentity.hurt(livingentity.damageSources().wither(), 1.0F);
    }

    @Override
    public boolean isDurationEffectTick(int tick, int amplifier) {
        int i;
        i = 40 >> amplifier;
        if (i < 5) {
            i = 5;
        }
        return tick % i == 0;
    }
}
