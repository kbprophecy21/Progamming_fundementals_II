package chapter7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Sequential_Search {

    public static int LeanerSearch(String[] array, int Size,  String value)
    {
        int index;
        for (index = 0; index < array.length; index++)
        {
            if (array[index] == value)
            {
                System.out.println("Found value at position #: " + index);
                return index;
            }
        }
        return -1;
    }


    /*
     * we have a file that has some words in it
     * we want to read from that file and find a paticular word.
     * 
     * 
     *  mehtod to read words from a  file and adds them to a partial array.
     * and return the number of words added to the array.
     */
    public static int FindWordFromFile(String[] words) throws FileNotFoundException
    {
        File file = new File("dummyfile.txt");
        if (!file.exists())
        {
            System.out.println("The file doesn't exist");
            return 0;
        }
        int number = 0;
        Scanner inputFile = new Scanner(file);
        while (inputFile.hasNext())
        {
            words[number] = inputFile.nextLine();
            number++;
        }
        inputFile.close();
        return number;
    }

     


    
}
