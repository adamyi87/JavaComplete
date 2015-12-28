package com.projekt2501;

/**
 * Created by ay-sam on 12/18/15.
 */
public class Dimension {
    private int width;
    private int height;
    private int depth;

    //===== GETTERS
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getDepth() {
        return depth;
    }

    //===== CONSTRUCTOR
    public Dimension(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
}
