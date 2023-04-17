package project;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class KyleBrewerArray {

    // FIELDS
    private String[] Names;
    private int Number;
    // ----------------------------------field
    // end---------------------------------------------//

    // NO-ARG CONSTRUCTOR
    /**
     * no arg constructor that allocate memory for a String Array size 400 and
     * also assigns number varible to the value 0.
     */
    public KyleBrewerArray() {

        this.Names = new String[400]; // allocate memory
        this.Number = 0; // assigs number to 0

    }

    // ----------------------------------contstructor
    // end----------------------------------------------//
    // METHODS
    /**
     * add method that reads the lines from the file
     * and store each line into the
     * {name} array [DO NOT HARDCODE THE VALUES FROM THE FILE!!]
     * 
     * @throws FileNotFoundException
     */
    public void add() throws FileNotFoundException {

        // declare the file and scanner object
        File myfile = new File("Assignment7Data.txt");
        if (!(myfile.exists()))
        {
            System.out.println("File does not exist");
            return ;
        }
        Scanner inputFile = new Scanner(myfile);
        while (inputFile.hasNext()) {
            Names[Number] = inputFile.nextLine();
            Number++;
        }
    
        inputFile.close();
    }

    /*
     * get method that takes a Integer N as a parameter
     * and returns the string of that value.
     */
    public String get(int index) {

        String value = "";
        for (int i = 0; i < this.Names.length; i++) {
            if (i == index)
                value = this.Names[i];
        }
        return value;
    }

    /**
     * set method thats void. takes 2 parameters (int N, String s).
     * replaces the position of that index N and places s at the value.
     */
    public void set(int N, String value) {

        this.Names[N] = value; // Assigns value to placevalue index
    }

    /**
     * search method that searches for the word by using the index position
     * using a sequential search.
     */
    public int Search(String value) {

        int element = -1;
        boolean found = false;
        int index = 0;
        while (!found && index < this.Names.length) {
            if (value.equals(this.Names[index])) {
                found = true;
                element = index;
                break;
            }
            index++;
        }
        return element;

    }

    /**
     * Sort method that sorts the array object in
     * ascending order using the selection sort algorithm
     */
    public void Sort() {
        // sort the array
        for (int j = 0; j < this.Number - 1; j++) {
            int min = j;
            for (int k = j + 1; k < this.Number; k++) {
                if (this.Names[k].compareTo(this.Names[min]) < 0)
                    min = k;
            }
            String temp = this.Names[j];
            this.Names[j] = this.Names[min];
            this.Names[min] = temp;

        }
    }

    /**
     * ToString method that returns formatted
     * ("Names = {names 0 , names 1, names 2...}")
     * 
     */
    public String toString() {

        String s = "Names = [";
        for (int index = 0; index <= Number - 1; index++) {
            s += Names[index] + " ,";
        }
        return s += "] ";
    }

}