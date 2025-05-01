package bep.uap_alby.mobeffects;

import bep.uap_alby.UAP_Alby;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Alby_MobEffectRegistry {
    public static final DeferredRegister<MobEffect> MOBEFFECTS = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, UAP_Alby.MODID);

    public static final RegistryObject<MobEffect> BREAKING_LIMIT = MOBEFFECTS.register("breakinglimit", () -> new BreakingLimit_Effect(MobEffectCategory.NEUTRAL, 0xff0064).addAttributeModifier(Attributes.MOVEMENT_SPEED, "b1e21b5d-78a3-408a-bacd-712251a03feb", 0.25f, AttributeModifier.Operation.MULTIPLY_TOTAL));

}
