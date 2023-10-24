package com.notenoughmail.entityjs;

import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

// Named this way to not interfere with Kube's EntityJS class
@Mod(EntityJSMod.MOD_ID)
public class EntityJSMod {

    public static final String MOD_NAME = "EntityJS";
    public static final Logger LOGGER = LogUtils.getLogger();
    public static final String MOD_ID = "entityjs";

    public EntityJSMod() {
    }
}
