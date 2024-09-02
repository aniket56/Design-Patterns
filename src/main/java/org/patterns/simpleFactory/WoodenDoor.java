package org.patterns.simpleFactory;

// WoodenDoor is concrete implementation of Door
public class WoodenDoor implements Door{

    private float width;
    private float height;

    public WoodenDoor(float width, float height){
        this.height=height;
        this.width=width;
    }

    public float getWidth() {
        return width;
    }
    public float getHeight() {
        return height;
    }
}
