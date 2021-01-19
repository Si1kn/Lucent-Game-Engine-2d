package io.github.si1kn.gameEngine.entity;

import io.github.si1kn.gameEngine.entity.abstractClass.AbstractEntity;
import io.github.si1kn.gameEngine.entity.abstractClass.Position;
import io.github.si1kn.gameEngine.events.KeyboardClickedEvent;
import io.github.si1kn.gameEngine.events.KeyboardUnClickedEvent;
import io.github.si1kn.gameEngine.textureHandling.Texture;

import java.awt.*;
import java.io.File;

public class Player extends AbstractEntity {
    private boolean left, right, up, down;

    @Override
    public void render(Graphics g, Position pos) {
        g.drawImage(getTexture().getFileAsImage(), pos.getX(), pos.getY(), getTexture().getXsize(), getTexture().getYsize(), null);
    }

    @Override
    public Texture getTexture() {
        return new Texture(new File("C:\\JavaProjects\\Lucent-Game-Engine\\src\\main\\resources\\player\\player.png"), 50, 50);
    }

    @Override
    public void keyboardUnClicked(KeyboardUnClickedEvent e) {
        if (e.getEvent().getKeyCode() == java.awt.event.KeyEvent.VK_LEFT) {
            left = false;
        }

        if (e.getEvent().getKeyCode() == java.awt.event.KeyEvent.VK_RIGHT) {
            right = false;
        }
        if (e.getEvent().getKeyCode() == java.awt.event.KeyEvent.VK_UP) {
            up = false;
        }
        if (e.getEvent().getKeyCode() == java.awt.event.KeyEvent.VK_DOWN) {
            down = false;
        }
    }

    @Override
    public void keyboardClicked(KeyboardClickedEvent e) {
        if (e.getEvent().getKeyCode() == java.awt.event.KeyEvent.VK_LEFT) {
            left = true;
        } else {
            left = false;
        }

        if (e.getEvent().getKeyCode() == java.awt.event.KeyEvent.VK_RIGHT) {
            right = true;
        } else {
            right = false;
        }
        if (e.getEvent().getKeyCode() == java.awt.event.KeyEvent.VK_UP) {
            up = true;
        } else {
            up = false;
        }

        if (e.getEvent().getKeyCode() == java.awt.event.KeyEvent.VK_DOWN) {
            down = true;
        } else {
            down = false;
        }
    }

    @Override
    public void personalUpdate() {
        if (left) {
            pos.addX(-1);
        } else if (up) {
            pos.addY(-1);
        } else if (right) {
            pos.addX(1);
        } else if (down) {
            pos.addY(1);
        }
    }
}
