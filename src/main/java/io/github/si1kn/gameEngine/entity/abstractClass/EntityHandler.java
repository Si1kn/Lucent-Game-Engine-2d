package io.github.si1kn.gameEngine.entity.abstractClass;


import io.github.si1kn.gameEngine.entity.Player;
import io.github.si1kn.gameEngine.events.KeyboardClickedEvent;
import io.github.si1kn.gameEngine.events.KeyboardUnClickedEvent;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class EntityHandler {
    List<AbstractEntity> abstractEntityList = new ArrayList<>();

    public EntityHandler() {
        abstractEntityList.add(new Player());
    }

    public void render(Graphics graphics) {
        for (AbstractEntity ae : abstractEntityList) {
            ae.render(graphics, ae.pos);
        }
    }

    public void keyboardClicked(KeyboardClickedEvent e) {
        for (AbstractEntity ae : abstractEntityList) {
            ae.keyboardClicked(e);
        }
    }

    public void keyboardUnClicked(KeyboardUnClickedEvent e) {
        for (AbstractEntity ae : abstractEntityList) {
            ae.keyboardUnClicked(e);
        }
    }

    public void update() {
        for (AbstractEntity p : abstractEntityList) {
            p.personalUpdate();
        }
    }
}
