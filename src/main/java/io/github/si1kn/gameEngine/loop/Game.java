package io.github.si1kn.gameEngine.loop;

import com.google.common.eventbus.EventBus;
import io.github.si1kn.gameEngine.engineParts.DrawingEngine;
import io.github.si1kn.gameEngine.engineParts.UpdateEngine;
import io.github.si1kn.gameEngine.input.MouseAndKeyboard;

import javax.swing.*;
import java.awt.*;

public class Game extends JFrame implements Runnable {

    private final DrawingEngine drawingEngine;
    private final UpdateEngine updateEngine;

    public static EventBus EVENT_BUS = new EventBus();

    public Game() {
        setSize(600, 600);
        setTitle("game");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        this.drawingEngine = new DrawingEngine(600, 600);
        this.updateEngine = new UpdateEngine(drawingEngine.getEntityHandler());
        MouseAndKeyboard mkb = new MouseAndKeyboard();
        addMouseListener(mkb);
        addKeyListener(mkb);

    }


    public void run() {
        long lastTime = System.nanoTime();
        double nsPerTick = 1000000000D / 60;

        int ticks = 0;
        int frames = 0;

        long lastTimer = System.currentTimeMillis();
        double delta = 0;

        while (true) {
            long now = System.nanoTime();
            delta += (now - lastTime) / nsPerTick;
            lastTime = now;
            boolean shouldRender = true;

            while (delta >= 1) {
                ticks++;
                delta -= 1;
                shouldRender = true;
            }

            try {
                Thread.sleep(2);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            if (shouldRender) {
                frames++;
                this.update();
                this.renderer();
            }

            if (System.currentTimeMillis() - lastTimer >= 1000) {
                lastTimer += 1000;
                System.out.println(ticks + " ticks, " + frames + " frames");
                frames = 0;
                ticks = 0;
            }
        }
    }

    private void renderer() {
        clearImage(drawingEngine.getGraphics());
        drawingEngine.render();
        getGraphics().drawImage(drawingEngine.getImg(), 0, 0, null);
    }

    private void update() {
        this.updateEngine.update();
    }

    private void clearImage(Graphics g) {
        g.fillRect(0, 0, 600, 600);
    }
}
