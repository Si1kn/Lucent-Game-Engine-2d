package io.github.si1kn.gameEngine.engineParts;

import com.google.common.eventbus.Subscribe;
import io.github.si1kn.gameEngine.entity.abstractClass.EntityHandler;
import io.github.si1kn.gameEngine.events.KeyboardClickedEvent;
import io.github.si1kn.gameEngine.events.KeyboardUnClickedEvent;
import io.github.si1kn.gameEngine.loop.Game;

public class UpdateEngine {

    private final EntityHandler entityHandler;

    public UpdateEngine(EntityHandler entityHandler) {
        this.entityHandler = entityHandler;
        Game.EVENT_BUS.register(this);
    }


    @Subscribe
    public void keyboardClicked(KeyboardClickedEvent e) {
        entityHandler.keyboardClicked(e);
    }

    @Subscribe
    public void keyboardClicked(KeyboardUnClickedEvent e) {
        entityHandler.keyboardUnClicked(e);
    }

    public void update() {
        entityHandler.update();
    }
}
