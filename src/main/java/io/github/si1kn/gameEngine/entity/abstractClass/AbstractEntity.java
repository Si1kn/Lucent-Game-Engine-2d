package io.github.si1kn.gameEngine.entity.abstractClass;

import io.github.si1kn.gameEngine.events.KeyboardClickedEvent;
import io.github.si1kn.gameEngine.events.KeyboardUnClickedEvent;
import io.github.si1kn.gameEngine.textureHandling.Texture;

import java.awt.*;

public abstract class AbstractEntity {
    public Position pos = new Position(0, 0);

    public abstract void render(Graphics g, Position pos);

    public abstract Texture getTexture();


    public abstract void keyboardUnClicked(KeyboardUnClickedEvent e);

    public abstract void keyboardClicked(KeyboardClickedEvent e);

    public abstract void personalUpdate();
}
