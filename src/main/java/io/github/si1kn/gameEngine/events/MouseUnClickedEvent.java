package io.github.si1kn.gameEngine.events;

import java.awt.event.MouseEvent;

public class MouseUnClickedEvent {
    private final MouseEvent event;

    public MouseUnClickedEvent(MouseEvent e) {
        this.event = e;
    }

    public MouseEvent getEvent() {
        return event;
    }
}
