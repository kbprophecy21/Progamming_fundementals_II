package projectEmployee;

import java.util.Scanner;

public class Employee {

    // ---------------------Fields---------------------//
    private String Name;
    private long employeeID;
    private float HourlyPay;
    private float hours;
    private String[] ListOfPositions;
    private final int MAXJOBS = 10;
    private String Job;
    private int[] WeeklyHours;

    // -------------------Constructor------------------//
    public Employee(String employeeName, float employeePay, String JobPositions) {
        Name = employeeName;
        HourlyPay = employeePay;
        Job = JobPositions;
        employeeID = Settings.RandomEmployeeNumberGenerator();
        WeeklyHours = new int[Settings.PayPeriod()];
        ListOfPositions = new String[MAXJOBS];
        ListOfPositions[-1] = Job;
    }

    // --------------------Methods---------------------//

    /**
     * CheckHour method allow the employee to check hours for the week.
     * 
     */
    public void CheckHours() {
        if (WeeklyHours.length < 0) {
            System.out.println("You have no record of hours logged!");
        } else {
            for (int index = 0; index < WeeklyHours.length; index++) {
                System.out.print(WeeklyHours[index]);
            }
        }
    }

    /**
     * requestOff method allows the employee to request off.
     */

    /**
     * callin method allow the employee to call out for the day
     * 
     */

    /**
     * terminate method allow the employee to quit/terminate.
     * deletes the employee object.
     */

    /**
     * checkpoints method allow the employee to check how many points they have
     * obtain. if points exceed over max amount then termination is possible.
     */

}
