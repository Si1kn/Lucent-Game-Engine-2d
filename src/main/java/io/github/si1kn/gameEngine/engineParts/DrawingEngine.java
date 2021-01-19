package io.github.si1kn.gameEngine.engineParts;

import io.github.si1kn.gameEngine.entity.abstractClass.EntityHandler;

import java.awt.*;
import java.awt.image.BufferedImage;

public class DrawingEngine {
    private BufferedImage img;

    EntityHandler entityHandler = new EntityHandler();

    public DrawingEngine(int x, int y) {
        img = new BufferedImage(x, y, BufferedImage.TYPE_INT_ARGB);
    }

    public BufferedImage getImg() {
        return img;
    }

    public Graphics getGraphics() {
        return img.getGraphics();
    }

    public void render() {
        entityHandler.render(this.getGraphics());
    }

    public EntityHandler getEntityHandler() {
        return entityHandler;
    }
}
