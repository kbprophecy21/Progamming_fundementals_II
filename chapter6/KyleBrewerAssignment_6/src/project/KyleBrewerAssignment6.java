package project;

public class KyleBrewerAssignment6 {

    public static void main(String[] args) throws Exception {

        KyleBrewerMonth Month1 = new KyleBrewerMonth();
        KyleBrewerMonth Month2 = new KyleBrewerMonth(2);
        KyleBrewerMonth Month3 = new KyleBrewerMonth("October");
        KyleBrewerMonth Month4 = new KyleBrewerMonth(Month3);

        System.out.println("this month number is: " + Month1.getNumber());
        System.out.println("this month number is: " + Month2.getNumber());
        System.out.println("this month number is: " + Month3.getNumber());
        System.out.println("this month number is: " + Month4.getNumber());

        System.out.println("\n\n\t*****************************************");
        Month1.getName();
        System.out.print("\n");
        Month2.getName();
        System.out.print("\n");
        Month3.getName();
        System.out.print("\n");
        Month4.getName();
        System.out.println("\n\n\t*****************************************");
        Month1.setNumber(10);
        System.out.println(Month1.toString()); 
        System.out.println(Month2.toString()); 
        System.out.println(Month3.toString()); 
        System.out.println(Month4.toString()); 
        System.out.println("\n\n\t*****************************************");
        boolean value = Month1.equals(Month2);
        int othervalue = Month3.compareTo(Month4);
        System.out.println(value);
        System.out.println(othervalue);

    }
}
