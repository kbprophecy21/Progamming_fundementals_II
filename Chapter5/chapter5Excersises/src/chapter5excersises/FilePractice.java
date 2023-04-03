
package chapter5excersises;
//import java.io.FileWriter;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class FilePractice {
    
    
    public void ReadFile() throws FileNotFoundException
    {
        
        File file = new File ("Numbers.txt");
        
        if (!file.exists())
            System.out.print("The file Numbers.txt does not exist");
        else
        {   
            //open the file
            
            Scanner inputFile = new Scanner(file);
            
            //read from file
            while(inputFile.hasNext())
            {
                int number = inputFile.nextInt();
                System.out.print(number);
            }
            
            
            inputFile.close();
        }
    }
}
