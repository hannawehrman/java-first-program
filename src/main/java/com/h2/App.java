package com.h2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public static int doubleTheNumber(int number) {
        return -1;
    }
    public static int add(int[] numbers) {
        var sum = 0;
        for(int number: numbers) {
            sum += number;
        }
        return sum;
    }
}
