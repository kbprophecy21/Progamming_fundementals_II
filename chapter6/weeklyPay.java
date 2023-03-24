package chapter6;


public class weeklyPay {
    

    //calculate  the weekly pay.
    public static double getWeeklyPay(int hour, double payRate){

        return hour * payRate;
    }

    /*
     * calculate the weekly pay for salaried employees.
     */

     public static double getWeeklyPay(double yearlySalary){
        int WEEKSINYEAR = 52;
        return yearlySalary/WEEKSINYEAR;
     }
}
