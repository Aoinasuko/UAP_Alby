package bep.uap_alby;

import bep.uap_alby.mobeffects.Alby_MobEffectRegistry;
import bep.uap_alby.skill.Alby_SkillRegistry;
import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(UAP_Alby.MODID)
public class UAP_Alby {

    // MODID
    public static final String MODID = "uap_alby";
    // ログ
    public static final Logger LOGGER = LogUtils.getLogger();

    public UAP_Alby() {
    }

    public UAP_Alby(FMLJavaModLoadingContext context) {
        IEventBus modEventBus = context.getModEventBus();

        // MobEffectを登録
        Alby_MobEffectRegistry.MOBEFFECTS.register(modEventBus);

        // UmaSkillを登録
        Alby_SkillRegistry.SKILLS.register(modEventBus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

}

