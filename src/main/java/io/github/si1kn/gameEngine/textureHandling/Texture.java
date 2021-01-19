package io.github.si1kn.gameEngine.textureHandling;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Texture {

    private final File file;
    private final int ysize;
    private final int xsize;

    public Texture(File file, int ysize, int xsize) {
        this.file = file;
        this.ysize = ysize;
        this.xsize = xsize;
    }

    public File getFile() {
        return file;
    }

    public int getXsize() {
        return xsize;
    }

    public int getYsize() {
        return ysize;
    }

    public Image getFileAsImage() {

        try {
            return ImageIO.read(getFile());
        } catch (IOException exception) {
            exception.printStackTrace();
            return null;
        }

    }
}

