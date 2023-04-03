package chapter7;

import java.util.Scanner;

public class Test {


    // Input and Output from Array
    /**
     * Test InputOutputArray()
     */
    public static void InputOutputArray()
    {
        //declare an array of 5 integers.
        final int MAXNUM = 5;
        Scanner keyboard = new Scanner(System.in);

        int[] numbers = new int[MAXNUM];

        // read 5 numbers into the array.
        for (int i = 0; i < MAXNUM; i++)
        {
            System.out.printf("Enter Number %d: ", i+1);
            numbers[i] = keyboard.nextInt();

        }

        // print the array
        for (int index = 0; index < MAXNUM; index++)
        {
            System.out.println(numbers[index]+ " ");
        }

        // compute the sum of the numbers from the array.
        int Sum = 0;
        for (int i=0; i < MAXNUM; i++)
            Sum = Sum + numbers[i];
        System.out.print("The sum of the numbers is: " + Sum);
        
        keyboard.close();
    }

    /**
     * TestArray method;
     */
    public static void TestArray()
    {   
        // declare the array and ititialize at declarations
        int[] Numbers = {1, 2, 3, 4, 5, 6, 7, 4345, 23, 64, 23, 534 , 34, 34};

        // print the numbers using the regular for loop.

        int i;
        System.out.println("This is with a regular for Loop: \n\t");
        for (i=0; i < Numbers.length; i++)
        {
            System.out.println("The numbers is  " + Numbers[i]);
        }

        // print the numbers using the enhance for loop
        System.out.println("\nThe numbers are (using enhanced loop)");
        for (int element : Numbers)
            System.out.println("The number is "+ element);


        // print the numbers using the enhanced for loop.

        System.out.println("\nThe numbers are on the same line");
        for (int element: Numbers)
            System.out.print(element + " ");
        
    }

    public static void TestEmployeePayArray()
    {
        EmployeesPayArray myEmployeesPayArray = new EmployeesPayArray();
        
        myEmployeesPayArray.InputHours();
        myEmployeesPayArray.OuputHours();
    
        myEmployeesPayArray.InputPayRate();
        myEmployeesPayArray.OutputGrossPay();
    }


    /**
     * method to read an array from the user
     * @param Numbers
     */
    public static void ReadArray(int[] Numbers)
    {
        Scanner keyboard = new Scanner(System.in);
        for (int index = 0; index < Numbers.length; index++)
        {
            System.out.printf("\nEnter number %d: ", index + 1);
            Numbers[index] = keyboard.nextInt();
        }
        
    }

    /**
     * method to print an array recieved as parameters
     */
    public static void PrintArray(int[] Numbers)
    {
        System.out.println("\nThe numbers are: ");
        for ( int element : Numbers)
            System.out.print(element + ", ");
    }


    /**
     * method to test array as parameters
     */

    public static void TestArrayParameters()
    {
        // create the array
        int[] numberlist = new int[5];

        //read into the array
        ReadArray(numberlist);
        
        //print the array
        PrintArray(numberlist);
    }

    /**
     * method that takes two arrays and compares them if they
     * are equal then returns true.
     * else returns false
     * 
     */
    public static boolean TestEqualArrays(int[] array_one , int[] array_two)
    {
        boolean value = true;

        if (array_one.length != array_two.length)
            value = false;
        int index;
        for (index = 0; index < array_one.length; index++)
        {
            if (array_one[index] != array_two[index])
                value = false;

        }
        return value;
    }

    public static void TestCompareArray()
    {
        // create and print numbers_1
        int[] numbers_1 = {1, 2, 3, 4, 5};
        PrintArray(numbers_1);
        System.out.println("\n");

        // create and print numbers_2
        int[] numbers_2 = new int[6];
        PrintArray(numbers_2);
        System.out.println("\n");

        // create and print numbers_3
        int[] numbers_3 = {1, 2, 3, 4, 5};
        PrintArray(numbers_3);
        System.out.println("\n");

        // compare numbers_3 with numbers_1
        boolean value = TestEqualArrays(numbers_3, numbers_1);
        System.out.println("Numbers_3 and Numbers_1 are: " + value);

        // compare numbers_1 with numbers_2
        boolean value_two = TestEqualArrays(numbers_1, numbers_2);
        System.out.println("Numbers_1 and Numbers_2 are: " + value_two);

    }


    /**
     * method that returns the maxium number in the array
     */
    public static void getMaxNumber(int[] arrayNumbers)
    {   
        int max = Integer.MAX_VALUE;
        int index;
        for ( index = 0; index < arrayNumbers.length; index++)
        {
            if (arrayNumbers[index] > max)
                max = arrayNumbers[index];
        
        }
        System.out.println("Largest number in array is: " + max);
    }



     /**
      * method that returns the minium number in the array.
      */
      public static void getMinNumber(int[] arrayNumbers)
      {
          int min = Integer.MAX_VALUE;
          int index;
          for (index = 0; index < arrayNumbers.length; index++)
          {
              if (arrayNumbers[index] < min)
                  min = arrayNumbers[index];
          
          }
          System.out.println("smallest number in array is: " + min);
      }
}
