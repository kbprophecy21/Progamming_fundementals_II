package chapter6;

import java.util.Scanner;

public class Test {

    public static void TestWeeklyPay() {
        // weekly salary for an hourly employee
        int hours = 30;
        double hourlyRate = 15.0;

        double weeklypay = weeklyPay.getWeeklyPay(hours, hourlyRate);

        System.out.printf("The salary for hourly employee is: %,.2f", weeklypay);

        // weekly salary for a salaried emplyee.

        double salary = 70000;
        double weeklySalaryPay = weeklyPay.getWeeklyPay(salary);
        System.out.printf("\nThe salary for salaried employee is: %,.2f", weeklySalaryPay);

    }

    public static void TestRectangle() {
        // boxOne
        Rectangle box1 = new Rectangle(2, 4);
        System.out.printf("Box 1 is %f by %f\n\n", box1.getLength(), box1.getWidth());
        // boxTwe
        Rectangle box2 = new Rectangle();
        System.out.printf("Box 2 is %f by %f\n\n", box2.getLength(), box2.getWidth());

        // make box 2 be 3 by 6
        box2.setLength(3);
        box2.setLength(6);
        System.out.printf("Box 2 is %f by %f\n\n", box2.getLength(), box2.getWidth());
    }

    public static void TestInventoryItem() {
        InventoryItem item1 = new InventoryItem();
        item1.Display("1");

        InventoryItem item2 = new InventoryItem("Pens", 40);
        item2.Display("2");

        InventoryItem item3 = new InventoryItem("Pencils", 33);
        item3.Display("3");

    }

    public static void TestGetINventoryItemData() {
        // InventoryItem item;
        // item = getInventoryItem();
        // item.Display("RETURNED");

    }

    public static void TestStock() {
        Stock stock1 = new Stock("BCD", 10);
        Stock stock2 = new Stock("GOOGLE", 203);
        Stock stock3 = new Stock("BVN", 56);
        Stock stock4 = new Stock("BCD", 10);
        System.out.println("Stock one:" + stock1.toString());
        System.out.println("Stock two:" + stock2.toString());
        System.out.println("Stock three:" + stock3.toString());
        System.out.println("***************************************************\t\n");
        Stock.compareStock(stock1, stock4);
        System.out.println("***************************************************\t\n");
        Stock.compareStock(stock3, stock2);

    }

    public static void TestCopyOject() {
        Stock stockOne = new Stock("GHB", 20);

        stockOne.copy();

    }

    public static void TestCopyConstructor() {
        Stock stock_one = new Stock("GRB", 40);
        Stock stock_two = new Stock(stock_one);
        System.out.println(stock_one);
        System.out.println("\n**********************************************");
        System.out.println(stock_two);
    }

    public static Stock TestUserInput() {

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Name of the stock symbol: ");
        String symbol = keyboard.nextLine();
        System.out.println("*****************************");
        System.out.print("Price of the Stock: ");
        float price = keyboard.nextFloat();

        // create the stock
        Stock newStock = new Stock(symbol, price);

        System.out.println("\n Creating new stock...\n************************************");
        keyboard.close();

        return newStock;
    }

    public static void TestAggClasses() {
        Instructor myinstructor = new Instructor("Kyle", "Brewer", "102");
        TextBook myTextBook = new TextBook("Java is fun", "Gibbs", "ping");
        Course myCourse = new Course("Java", myinstructor, myTextBook);
        System.out.println(myCourse);
    }

}
