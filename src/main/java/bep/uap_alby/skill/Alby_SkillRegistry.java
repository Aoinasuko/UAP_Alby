package bep.uap_alby.skill;

import bep.uap_alby.UAP_Alby;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.tracen.umapyoi.registry.skills.SkillType;
import net.tracen.umapyoi.registry.skills.SpeedSkill;
import net.tracen.umapyoi.registry.skills.UmaSkill;

import java.util.function.Supplier;

public class Alby_SkillRegistry {

    public static final DeferredRegister<UmaSkill> SKILLS = DeferredRegister.create(UmaSkill.REGISTRY_KEY, UAP_Alby.MODID);

    public static final RegistryObject<UmaSkill> BREAKINGLIMIT = SKILLS.register("breakinglimit", () -> new BreakingLimit_Skill(new UmaSkill.Builder().level(1).type(SkillType.BUFF).actionPoint(400).requiredWisdom(2), 400));

    // 固有スキル
    public static final RegistryObject<UmaSkill> BEYONDTHEFUTUREAHEAD = SKILLS.register("beyondthefutureahead", () -> new BreakingLimit_Skill(new UmaSkill.Builder().level(2).type(SkillType.BUFF).requiredWisdom(4), 400));

}
