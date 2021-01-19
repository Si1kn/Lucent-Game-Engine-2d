package io.github.si1kn.gameEngine.entity.abstractClass;

public class Position {


    private int x, y;

    public Position(int x, int y) {
        this.x = (int) x;
        this.y = (int) y;
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setAbsolute(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void addX(int i) {
        x += i;
    }

    public void addY(int i) {
        y += i;
    }
}
