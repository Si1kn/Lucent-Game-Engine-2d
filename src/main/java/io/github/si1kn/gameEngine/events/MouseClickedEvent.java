package io.github.si1kn.gameEngine.events;

import java.awt.event.MouseEvent;

public class MouseClickedEvent {

    private final MouseEvent event;

    public MouseClickedEvent(MouseEvent e) {
        this.event = e;
    }

    public MouseEvent getEvent() {
        return event;
    }
}
