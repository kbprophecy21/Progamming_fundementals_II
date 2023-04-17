package project;

import java.io.FileNotFoundException;

public class Assignment7DriverClass {

    public static void TestKyleBrewerArray() throws FileNotFoundException
    {
        KyleBrewerArray KB_ArrayNames = new KyleBrewerArray();
        KB_ArrayNames.add();
        String ArrayToString = KB_ArrayNames.toString();
        System.out.println("\n--------------------------------------\n");
        System.out.println("AFTER ADD!\n");
        System.out.println(KB_ArrayNames.get(15));
        KB_ArrayNames.set(0, "Kyle Brewer");
        ArrayToString = KB_ArrayNames.toString();
        System.out.println("\n\nAFTER SET!");
        System.out.println(ArrayToString);
        System.out.print("\n\"Courier New\" is in postion index: " + KB_ArrayNames.Search("Courier New"));
        KB_ArrayNames.Sort();
        System.out.println("\n\t\nAFTER SORT\n\t");
        ArrayToString = KB_ArrayNames.toString();
        System.out.println(ArrayToString);
    }

  

    public static void main(String[] args) throws FileNotFoundException {
        Assignment7DriverClass.TestKyleBrewerArray();
        
    }
    
}
