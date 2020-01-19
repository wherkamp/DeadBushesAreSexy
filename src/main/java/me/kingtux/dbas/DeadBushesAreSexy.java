package me.kingtux.dbas;

import org.kakara.core.mod.ModType;
import org.kakara.core.mod.annotations.ModInfo;
import org.kakara.core.mod.game.GameMod;
import org.kakara.core.resources.ResourceType;

@ModInfo(version = "1.0",modType = ModType.REGULAR,name = "DeadBushesAreSexy")
public class DeadBushesAreSexy extends GameMod{
    public void enable(){

        registerResource("textures/dead_bush.png", ResourceType.TEXTURE);
        getKakaraCore().getItemManager().registerItem(new DeadBush(),this);
    }
}
