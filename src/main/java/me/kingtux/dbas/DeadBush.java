package me.kingtux.dbas;

import org.kakara.core.annotations.Hardness;
import org.kakara.core.annotations.Id;
import org.kakara.core.annotations.Name;
import org.kakara.core.annotations.Texture;
import org.kakara.core.events.entity.StepOnEvent;
import org.kakara.core.events.player.ClickEvent;
import org.kakara.core.events.player.PlaceEvent;
import org.kakara.core.mod.game.ModBlock;

@Id("dead_bush")
@Name("Dead Bush")
@Texture("textures/dead_bush.png")
@Hardness(0.1f)
public class DeadBush extends ModBlock {
    @Override
    public void onStep(StepOnEvent event) {

    }

    @Override
    public void onPlace(PlaceEvent event) {

    }

    @Override
    public void onClick(ClickEvent clickEvent) {

    }
}
