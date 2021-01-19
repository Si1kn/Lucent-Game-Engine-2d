package io.github.si1kn.gameEngine.events;

import java.awt.event.KeyEvent;

public class KeyboardUnClickedEvent {
    private final KeyEvent event;

    public KeyboardUnClickedEvent(KeyEvent e) {
        this.event = e;
    }

    public KeyEvent getEvent() {
        return event;
    }
}
