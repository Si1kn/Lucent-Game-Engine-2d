package io.github.si1kn.gameEngine;

import io.github.si1kn.gameEngine.loop.Game;

public class GameLauncher {

    public static void main(String[] args) {
        Game game = new Game();
        new Thread(game).start();
    }
}
