
package chapter5excersises;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

public class Chapter5Excersises {
    
    
    
    public static void CounterControlledLoop(){
        
        //Read 5 numbers from the user and compute and output
        //the sum, the average , the maxinum and the mininum.
        //of the numbers.
        
        // declare the Scanner 
        Scanner keyboard = new Scanner(System.in);
        
        //init the counter 
        int counter = 0;
        int sum= 0;
        int Max = Integer.MIN_VALUE;
        int MIN = Integer.MAX_VALUE;
        
        //Loop conditions
        while (counter < 5)
        {
            //Loop Statement
            
            //read the number N
            int N;
            System.out.print("Enter an integral number N: ");
            N = keyboard.nextInt();
            System.out.println("The number you entered is " + N);
            
            //update the counter
            counter++;
            
            // init statistics
            sum = sum + N;
            if (Max < N)
                Max = N;
            if (MIN > N)
                MIN =N;
            
        }
        System.out.println("\n\nThe sum of the number is: " + sum);
        double average = (double)sum/5;
        System.out.println("\n\nThe average is: " + average);
        System.out.println("\n\n The maxium of the number is: " + Max);
        System.out.println("\n\n The Miniunm of the number is: " + MIN);
        keyboard.close();
        
    }
    
    public static int checkNumber()
    {
        int num=101;
        Scanner keyboard = new Scanner(System.in);
        
        
        while (!((num >= 1) && (num<= 10))){
            System.out.print("\nEnter a number between one and ten: ");
            if (keyboard.hasNextInt())
                num = keyboard.nextInt();
            else
            {
                num = 101;
                keyboard.nextLine();
            }
            if ((num >= 1) && (num<= 10)) {
                return num;

            }
            else 
                System.out.print("\n\nThe number you entered is not valid!\n");

        }
        
        keyboard.close();
        return num;
       
    }
    
    // Methods to enter a valid number between 1 and 10 using a do-while statement
    public static int EnterNumber(){
        
        int num = 101;
         Scanner keyboard = new Scanner(System.in);
        
        do 
        {
            
           
            System.out.print("\nEnter a number between one and ten: ");
            if (keyboard.hasNextInt())
            {   
                 
                num = keyboard.nextInt();
                if ((num >= 1) && (num<= 10))
                {
                    return num;
                }
                else 
                    System.out.print("\n\nThe number you entered is not valid!\n");
            }  
            else
            {   
                System.out.print("\nYou did not enter a number! Try again.");
                num = 101;
                keyboard.nextLine();
            } 
        }
        while (!((num >= 1) && (num<= 10)));
            
            keyboard.close();
            return num;
        }
    
    
    // sentienel controlled loop fucntion
    public static void SentienelControlledLoop()
    {
        // read number from the user until they enter a sentienel value.
        //and compute the number of numbers, the sum , average, 
        // minium and maximun of the numbers.
        
        int number;
        int target = 0;
        int numberOfNumbers = 0;
        int sum= 0;
        int Max = Integer.MIN_VALUE;
        int MIN = Integer.MAX_VALUE;
        do
        {
            //read the number
            System.out.print("\n\nEnter a number: ");
            Scanner keyboard = new Scanner(System.in);
            number = keyboard.nextInt();
            System.out.print("The number you enter is " + number);
            
            //loop the statement
            if (number != target)
            {
                numberOfNumbers++;
                sum = number + sum;
            if (Max < number)
                    Max = number;
            if (MIN > number)
                    MIN =number;
            }
            
            //update the statitics
            
        
        }
        
        while (number!=target);
        
        System.out.println("\n\nThe total numbers you enter is: " + numberOfNumbers);
        System.out.println("\n\nThe total was: " + sum);
        double average = (double) sum / (double) numberOfNumbers;
        System.out.println("The avergage is: " + average);
        System.out.println("\n\n The maxium of the number is: " + Max);
        System.out.println("\n\n The Miniunm of the number is: " + MIN);
        
        //double average = (double)sum/5;
        //System.out.println("\n\nThe average is: " + average);
        ///System.out.println("\n\n The maxium of the number is: " + Max);
        //System.out.println("\n\n The Miniunm of the number is: " + MIN);
        //keyboard.close();
    }
    
    public static void printAllEven()
    {
     for (int k=2; k < 100; k++)
     {
        if (k % 2 == 0)
        {
            System.out.print(k + " ");
        }
     }
    }

    public static void CounterControlledLoop_forloop(){
        
        //Read 5 numbers from the user and compute and output
        //the sum, the average , the maxinum and the mininum.
        //of the numbers.
        
        // declare the Scanner 
        Scanner keyboard = new Scanner(System.in);
        
        //init the counter 
        
        int sum= 0;
        int Max = Integer.MIN_VALUE;
        int MIN = Integer.MAX_VALUE;
        
        //Loop conditions
        for  (int counter = 1; counter < 5; counter++)
        {
            //Loop Statement
            
            //read the number N
            int N;
            System.out.print("Enter an integral number N: ");
            N = keyboard.nextInt();
            System.out.println("The number you entered is " + N);
            
            //update the counter
            
            
            // init statistics
            sum = sum + N;
            if (Max < N)
                Max = N;
            if (MIN > N)
                MIN =N;
            
        }
        System.out.println("\n\nThe sum of the number is: " + sum);
        double average = (double)sum/5;
        System.out.println("\n\nThe average is: " + average);
        System.out.println("\n\n The maxium of the number is: " + Max);
        System.out.println("\n\n The Miniunm of the number is: " + MIN);
        keyboard.close();
        
    }
    
    public static void printStar(){
        
        
        for (int i = 0; i <= 5; i++){
            for (int j = 5; j >= 1; j--){       //NEEDS WORK
                System.out.print("*");
            }System.out.println("\n");
        } 
       
    }
    
    public static void letterValidatonGame(){
        
        
        char letter = 'X';
        Scanner keyboard = new Scanner(System.in);
        do {
            //read a letter.
            System.out.println("Enter a letter: ");
            letter = keyboard.nextLine().charAt(0);
            System.out.print(letter);
            System.out.print("\n");
            if (
                    (letter == 'A') || (letter == 'a') || 
                    (letter == 'E') || (letter == 'e') || 
                    (letter == 'I') || (letter == 'i') || 
                    (letter == 'O') || (letter == 'o') || 
                    (letter == 'U') || (letter == 'u') 
                )
            continue;
            
           
        }
        while ((letter != 'X') && (letter!= 'x'));
    }
    
    public static void WriteNumbersFile() throws FileNotFoundException{
        
        PrintWriter file = new PrintWriter("Number.txt");
        
        System.out.print("\nPrint numbers to the file\n");
        int k;
        for (k=1; k <= 100; k++){
            file.println(k);
        }
        file.close();
    }

       
        

    public static void main(String[] args) throws FileNotFoundException {
       
        //CounterControlledLoop();
        
        //checkNumber();
        //EnterNumber();
        //SentienelControlledLoop();
        //forloop();
        //CounterControlledLoop_forloop();
        //printStar();
        //letterValidatonGame();
        WriteNumbersFile();
        FilePractice obj = new FilePractice();
        obj.ReadFile();
        
    
    }
}
