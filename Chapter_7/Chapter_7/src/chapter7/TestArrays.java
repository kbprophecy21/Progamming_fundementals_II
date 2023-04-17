package chapter7;

import java.util.Scanner;

public class TestArrays {

    public static void StringArray() {
        String[] fruits = { "apple", "pears", "bananas", "orange" };
        printArray(fruits);
    }

    public static void printArray(String[] list) {
        for (String element : list)
            System.out.println(element);

    }

    public static void createlist() {
        // init varibles
        int LIMIT = 5; // change this to become dynamic so it's not hard coded.
        String SENTINEL = "Stop";
        int counter = 0;
        String element;

        // init array and objects.
        String[] array = new String[LIMIT];
        Scanner keyboard = new Scanner(System.in); // haven't closed the keyboard yet kyle!!!

        // using the do while loop to read at least onces for the array
        do {
            // read a number
            System.out.print("Enter a number or enter " + SENTINEL + " to exit:");
            element = keyboard.nextLine();

            // check if we reach the SENTINEL value.
            if (element == SENTINEL)
                break;

            // add it to the array.
            array[counter] = element;
            counter++;

            // check if we got to the limit
            if (counter == LIMIT)
                System.out.println("The array is reach max limit- Limit = " + LIMIT);

        } while ((element != SENTINEL) && (counter < LIMIT));
        printArray(array);
        keyboard.close();

    }


    public static void TestfindWord()
    {
        
    }


    

}
