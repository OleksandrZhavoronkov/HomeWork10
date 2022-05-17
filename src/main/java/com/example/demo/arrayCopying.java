package com.example.demo;
//todo 1. Создать массив на 20 чисел.
//todo 2. Ввести в него значения с консоли.
//todo 3. Создать два массива на 10 чисел каждый.
//todo 4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class arrayCopying {
    //Possibility for user to enter something and for program to read something
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Please, enter 20 numbers to fill in the array: ");
        //Creating and initializing an array for 20 elements
        int arraySize = 20;
        int[] arrayCopying = new int [arraySize];
        //Filling the array in, with numbers from the user
        for (int i = 0; i < arrayCopying.length; i++) {
            System.out.println("input " + i + " element: ");
            arrayCopying[i] = Integer.parseInt(READER.readLine());
        }
        //Displaying an initial array
        System.out.println("Initial Array: " + (Arrays.toString(arrayCopying)));
        //Used Arrays.copyofRange to copy from range from initial array to the new array
        int[] array1 = Arrays.copyOfRange(arrayCopying, arraySize-arraySize,arraySize/2);
        int[] array2 = Arrays.copyOfRange(arrayCopying, arraySize/2, arraySize);
        //Displaying new arrays:
        System.out.println("First half (10) elements from initial array: " + (Arrays.toString(array1)));
        System.out.println("Second half (10) elements from initial array: " + (Arrays.toString(array2)));
    }
}