package projectEmployee;

import java.util.ArrayList;

public class Manager extends Employee {

    // -------------Field------------------//

    ArrayList<Worker> ListOfWorkers = new ArrayList<Worker>();
    String Department = " ";

    // --------------Constructor----------------//
    public Manager(String employeeName, float employeePay, String JobPositions) {
        super(employeeName, employeePay, JobPositions);
        // TODO Auto-generated constructor stub
    }

    // ---------------Methods------------------//

    
}
