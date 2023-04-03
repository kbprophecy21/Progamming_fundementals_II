package chapter6;

import java.util.Scanner;

public class Chapter6Excercises {

    /*
     * passing object into a method
     * we are updating the inventory item on the object.
     */
    public static void updateInventoryItem(InventoryItem item, String newDescriptions, int units) {

        item.set(newDescriptions, units);

    }

    /*
     * return a referance to object
     */

    public static InventoryItem getInventoryItem() {
        // read the data from the user;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the item description");
        String descriptions = keyboard.nextLine();

        System.out.println("Enter teh number of units for the item: ");
        int units = keyboard.nextInt();
        keyboard.close();

        return new InventoryItem(descriptions, units);

    }

    public static void main(String[] args) {

        // TestWeeklyPay();
        // TestRectangle();
        // Test.TestInventoryItem();

        // Test.TestStock();

        // Test.TestCopyOject();

        // Test.TestCopyConstructor();

        // Stock stockOne = Test.TestUserInput();
        // stockOne.output();

        //Test.TestAggClasses();
        Test.TestUserCourses();

    }
}
