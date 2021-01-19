package io.github.si1kn.gameEngine.input;

import io.github.si1kn.gameEngine.events.KeyboardClickedEvent;
import io.github.si1kn.gameEngine.events.KeyboardUnClickedEvent;
import io.github.si1kn.gameEngine.events.MouseClickedEvent;
import io.github.si1kn.gameEngine.events.MouseUnClickedEvent;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import static io.github.si1kn.gameEngine.loop.Game.EVENT_BUS;

public class MouseAndKeyboard implements MouseListener, KeyListener {

    public MouseAndKeyboard() {

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        EVENT_BUS.post(new MouseClickedEvent(e));
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        EVENT_BUS.post(new MouseUnClickedEvent(e));
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    //Keyboard
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        EVENT_BUS.post(new KeyboardClickedEvent(e));
    }

    @Override
    public void keyReleased(KeyEvent e) {
        EVENT_BUS.post(new KeyboardUnClickedEvent(e));
    }
}
