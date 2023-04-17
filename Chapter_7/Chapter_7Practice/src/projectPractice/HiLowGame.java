package projectPractice;

import java.util.Scanner;

public class HiLowGame {

    // FIELD
    private int guess;
    private int cpuGuess;

    // NO-ARG CONTRUCTOR
    public HiLowGame() {
        guess = 0;
        cpuGuess = 0;
    }

    // SET CONSTRUCTOR
    public HiLowGame(int guess) {
        this.guess = guess;
        cpuGuess = 0;
    }

    // RANDOM CHOICE CONSTRUCTOR
    public HiLowGame(int min, int max) {
        cpuGuess = setGuess(min, max);
        guess = setGuess(min, max);
    }

    // METHODS

    /**
     * getter method <> returns int. gets the player guess
     * 
     * @return this.guess <int>
     */
    public int getter() {
        return this.guess;
    }

    /**
     * setter method <int> return void. sets the player guess value.
     * 
     * @return void
     */
    public void setter(int guessNumber) {
        this.guess = guessNumber;
    }

    /**
     * setGuess method that generate random number.
     * 
     * @param min
     * @param max
     * @return
     */
    public int setGuess(int min, int max) {
        int value;
        int range = (max - min) + 1;
        value = (int) (Math.random() * range) - 1;
        return value;
    }

    /**
     * compares the two field varibles and decides if your close enough;
     * 
     */
    public void Play() {
        do {
            Scanner keyboard = new Scanner(System.in);
            guess = keyboard.nextInt();
            if (guess < cpuGuess) {
                System.out.println("You need to go higher!");
            } else {
                System.out.println("You need to go lower!");
            }

        }

        while (!(guess == cpuGuess));
        System.out.println("YOU GOT IT!!");

    }

}
