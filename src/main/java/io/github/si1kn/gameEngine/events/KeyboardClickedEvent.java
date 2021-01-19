package io.github.si1kn.gameEngine.events;

import java.awt.event.KeyEvent;

public class KeyboardClickedEvent {

    private final KeyEvent event;

    public KeyboardClickedEvent(KeyEvent e) {
        this.event = e;
    }

    public KeyEvent getEvent() {
        return event;
    }
}
