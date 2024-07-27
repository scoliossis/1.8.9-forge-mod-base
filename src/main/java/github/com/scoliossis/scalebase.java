package github.com.scoliossis;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import org.lwjgl.opengl.Display;
import net.minecraftforge.fml.common.Mod.EventHandler;

@Mod(modid = scalebase.MODID, version = scalebase.VERSION)
public class scalebase {
    public static final String MODID = "scalebase";
    public static final String VERSION = "1.0";

    @EventHandler
    public void onInit(FMLPreInitializationEvent event) {
        // sorry if this base sucks idrk I have never made a 1.8.9 forge mod before :(

        // https://github.com/scoliossis
        // ^ find my socials here!

        Display.setTitle("cool awesomeness");

        MinecraftForge.EVENT_BUS.register(this);

        // register other files with
        //MinecraftForge.EVENT_BUS.register(new Killaura());
        // this allows these files to use @SubscribeEvent

        // to register commands
        // ClientCommandHandler.instance.registerCommand(new ClassThatExtendsCommandBase());
        // ^ make sure the class extends CommandBase!!!

        System.out.println("minecraft is booting up!!!");

        // I recommend loading configs in this event
    }

    @SubscribeEvent
    public void onTick(TickEvent.ClientTickEvent event) {
        // cool stuff here if u want!!
    }
}