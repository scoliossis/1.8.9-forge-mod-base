package github.com.scoliossis.mixins;

import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.launch.MixinBootstrap;
import org.spongepowered.asm.mixin.Mixins;

import javax.annotation.Nullable;
import java.util.Map;

public class MixinLoader implements IFMLLoadingPlugin {


    // loads the mixins!!
    public MixinLoader() {
        MixinBootstrap.init();
        Mixins.addConfiguration("mixins.scoliossis.json");
        System.out.println("mixins up");
    }



    // class implements IFMLLoadingPlugin, must implement the methods, intellij does this for me
    @NotNull
    @Override
    public String[] getASMTransformerClass() {
        return new String[0];
    }

    @Nullable
    @Override
    public String getModContainerClass() {
        return null;
    }

    @Nullable
    @Override
    public String getSetupClass() {
        return null;
    }

    @Override
    public void injectData(Map<String, Object> data) {

    }

    @Nullable
    @Override
    public String getAccessTransformerClass() {
        return null;
    }
}
