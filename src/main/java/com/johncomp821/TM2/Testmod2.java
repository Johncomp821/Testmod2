package com.johncomp821.TM2;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


@Mod(modid ="Testmod2", name ="Testmod 2", version ="1.7.10-1.0" )
public class Testmod2
{
    @Mod.Instance("Testmod2")
    public static Testmod2 instance;

    @Mod.EventHandler
    public void preInt(FMLPreInitializationEvent event) {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void post(FMLPostInitializationEvent event)
    {

    }
}
