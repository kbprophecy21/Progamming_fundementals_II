package projectPractice;

import java.io.PrintWriter;
import java.lang.Math;

public class Practice {


    //  field
    private int[] numList;

    // no-arg constructor
    public Practice()
    {
       numList = new int[400];
    }


    // methods

    public static void fileHandler()
    {

    }

    /**
     * method that creates random numbers and stores
     * into a list
     */
    public void addRandom(int min, int max, int qty)
    {   
        if (this.numList[qty] > 399)
        {   
            System.out.println("You exceed the max list number");
            return ;
        }
        int range = (max - min) + 1;
        for (int index = 0; index <= qty; index++)
        {
            this.numList[index] = (int)(Math.random() * range) - 1;
        }
    }

    /**
     * method that tell me the max
     */

    
}
