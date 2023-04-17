package projectPractice;

import java.util.Scanner;

public class Array_Ch7 {

    //------------------------------------fields-----//
    final private int Num_employees = 10; // number of employees
    int[] hours;
    String[] employee_name_list;

    //--------------------------------constructor--------//
    // No-arg Constructor
    public Array_Ch7() {

        int[] hours = new int[Num_employees];
        String[] employee_names_list = new String[Num_employees];
    }

    //-------------------------------- methods----//

    public void logEmployeeHours() {

        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i < Num_employees; i++)
        {
        System.out.printf("Employee # %d: ", i);
        hours[i] = keyboard.nextInt();
        }
        keyboard.close();
    }

    public void logEmployeeHour(String nameOfEmployee)
    {
        Scanner keyboard = new Scanner(System.in);
        if (employee_name_list.length < 0)
        {
            System.out.println("There are are no employee!");
            // function that ask to enter employee
        }
        for (int index = 0; index < nameOfEmployee.length(); index++)
        {
            if (nameOfEmployee.equals(employee_name_list[index]))
            {   


            }
        }

        
    }

    public void addHours()
    {
        
    }

}