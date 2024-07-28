package github.com.scoliossis.mixins;

import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;
import org.spongepowered.asm.launch.MixinBootstrap;
import org.spongepowered.asm.mixin.Mixins;

import java.util.Map;

public class MixinLoader implements IFMLLoadingPlugin {


    // loads the mixins!!
    public MixinLoader() {
        MixinBootstrap.init();
        System.out.println("mixins up");
        Mixins.addConfiguration("mixins.scoliossis.json");
    }



    // class implements IFMLLoadingPlugin, must implement the methods, intellij does this for me
    @Override
    public String[] getASMTransformerClass() {
        return new String[0];
    }

    @Override
    public String getModContainerClass() {
        return "";
    }

    @Override
    public String getSetupClass() {
        return "";
    }

    @Override
    public void injectData(Map<String, Object> map) {

    }

    @Override
    public String getAccessTransformerClass() {
        return "";
    }
}
