package org.example;

import org.patterns.simpleFactory.Door;
import org.patterns.simpleFactory.DoorFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Door door = DoorFactory.makeDoor(100,200);
        System.out.println("Widht: "+door.getWidth());
        System.out.println("Height: "+door.getHeight());
    }
}
