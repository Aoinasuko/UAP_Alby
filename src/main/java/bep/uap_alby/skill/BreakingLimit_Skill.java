package bep.uap_alby.skill;

import bep.uap_alby.mobeffects.Alby_MobEffectRegistry;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.tracen.umapyoi.api.UmapyoiAPI;
import net.tracen.umapyoi.registry.skills.UmaSkill;
import net.tracen.umapyoi.utils.UmaSoulUtils;

public class BreakingLimit_Skill extends UmaSkill {
    private final int life;

    public BreakingLimit_Skill(UmaSkill.Builder builder, int life) {
        super(builder);
        this.life = life;
    }

    public void applySkill(Level level, LivingEntity user) {
        ItemStack soul = UmapyoiAPI.getUmaSoul(user);
        int skillTime = this.getSpeedTime() + (UmaSoulUtils.getProperty(soul)[4] >= 10 ? 80 : UmaSoulUtils.getProperty(soul)[4] >= 7 ? 40 : 0);
        int skillLevel = this.getSkillLevel() - 1 + (UmaSoulUtils.getProperty(soul)[0] >= 10 ? 2 : UmaSoulUtils.getProperty(soul)[0] >= 7 ? 1 : 0);
        user.addEffect(new MobEffectInstance(Alby_MobEffectRegistry.BREAKING_LIMIT.get(), skillTime, skillLevel));
    }

    public int getSpeedTime() {
        return this.life;
    }
}
