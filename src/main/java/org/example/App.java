package org.example;

import org.patterns.factoryMethod.Interviewer;
import org.patterns.simpleFactory.Door;
import org.patterns.simpleFactory.DoorFactory;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.example.DinnerTable.count;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

       /* Door door = DoorFactory.makeDoor(100,200);
        System.out.println("Widht: "+door.getWidth());
        System.out.println("Height: "+door.getHeight());*/

        System.out.println(count(10, 10, 3, 5)); // Example call


        List<Integer> numbers = Arrays.asList(1,2,3,3,45,5);

        numbers.stream().sorted().forEach(System.out::println);



    }
}


