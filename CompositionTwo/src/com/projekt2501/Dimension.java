package com.projekt2501;

/**
 * Created by ay-sam on 12/21/15.
 */
public class Dimension {
    private int width;
    private int height;
    private int depth;

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getDepth() {
        return depth;
    }

    public Dimension(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public void getDimensionSize(){
        System.out.println("Dimension size is: " + this.width + "x" + this.height + "x" + this.depth);
    }
}
