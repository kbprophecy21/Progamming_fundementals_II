package chapter7;

import java.util.Scanner;

public class EmployeesPayArray {

    // fields
    private final int NUMBER_EMPLOYEES = 5;
    private int[] hours;
    private double payRate;

    // constructor
    public EmployeesPayArray() {
        hours = new int[NUMBER_EMPLOYEES];
        payRate = 0;
    }

    // methods

    /**
     * method to input the number of hours.
     */
    public void InputHours() {
        Scanner keyboard = new Scanner(System.in);
        int item;
        for (item = 0; item < NUMBER_EMPLOYEES; item++) {
            System.out.printf("Enter the number of hours for employee %d: ", item + 1);
            hours[item] = keyboard.nextInt();
            

        }

    }

    /**
     * method to input the pay rate
     */
    public void InputPayRate() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("\nEnter the pay rate: ");
        payRate = keyboard.nextDouble();
        
    }

    /**
     * method to output the hours
     * using enhance method.
     */
    public void OuputHours() {
        for (int element : hours)
            System.out.printf("\nCurrent employees hours: %d", element);
    }

    /**
     * method to compute and output the gross pay
     */
    public void OutputGrossPay() {
        for (int index = 0; index < hours.length; index++) {
            double grossPay = hours[index] * payRate;
            System.out.printf("Employee %d gross pay: $%,.2f\n", index + 1, grossPay);
        }
    }

    /**
     * method uses enhance method to compute and output the gross pay ???
     * 
     */




     /**
      * 
      */

}
