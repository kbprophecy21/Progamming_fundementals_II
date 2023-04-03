package project;

public class KyleBrewerMonth {

    // field
    private int Number;

    // No-argument constructor
    public KyleBrewerMonth() {
        this.Number = 1;
    }

    // Constructor that takes a intagral value.
    public KyleBrewerMonth(int monthNumber) {

        if ((monthNumber < 13) && (monthNumber > 0)) {
            this.Number = monthNumber;
        } else {
            this.Number = 1;
        }
    }

    // Constructor that takes a string value
    public KyleBrewerMonth(String months) {
        selectNumber(months);
    }

    // Copy Constructor
    public KyleBrewerMonth(KyleBrewerMonth copyObject) {

        Number = copyObject.Number;
    }

    // METHODS
    /**
     * selectName method
     * 
     * @return <String>
     */
    public void selectName(int monthNumber) { // number to name

        switch (monthNumber) {
            case 2:
                System.out.print("February");
                break;
            case 3:
                System.out.print("March");
                break;
            case 4:
                System.out.print("April");
                break;
            case 5:
                System.out.print("May");
                break;
            case 6:
                System.out.print("June");
                break;
            case 7:
                System.out.print("July");
                break;
            case 8:
                System.out.print("August");
                break;
            case 9:
                System.out.print("September");
                break;
            case 10:
                System.out.print("October");
                break;
            case 11:
                System.out.print("November");
                break;
            case 12:
                System.out.print("December");
                break;

            default:
                System.out.print("January");
                break;
        }
    }

    /**
     * selectNumber method
     * 
     * @return int
     */
    public void selectNumber(String month) // name to number
    {
        month = month.toLowerCase();

        switch (month) {
            case "febuary":
                this.Number = 2;
                break;
            case "march":
                this.Number = 3;
                break;
            case "april":
                this.Number = 4;
                break;
            case "may":
                this.Number = 5;
                break;
            case "june":
                this.Number = 6;
                break;
            case "july":
                this.Number = 7;
                break;
            case "august":
                this.Number = 8;
                break;
            case "september":
                this.Number = 9;
                break;
            case "october":
                this.Number = 10;
                break;
            case "november":
                this.Number = 11;
                break;
            case "december":
                this.Number = 12;
                break;

            default:
                this.Number = 1;
                break;
        }
    }

    /**
     * getNumber method
     * 
     * @return <Number>
     */
    public int getNumber() {
        return this.Number;
    }

    /**
     * setNumber method
     * 
     * @void
     */
    public void setNumber(int num) {
        this.Number = num;
    }

    /**
     * getName method
     * 
     * @return <String>
     */

    public void getName() {
        selectName(this.Number);
    }

    /**
     * toString method
     * 
     * @return <String>
     */
    public String toString() {

        getName();
        String s = " is " + this.Number;
        return s;
    }

    /**
     * equals method
     * 
     * @return <boolean>
     */
    public boolean equals(KyleBrewerMonth month_two) {

        if ((this.Number) == (month_two.Number)) {
            return true;
        }
        return false;
    }

    /**
     * compareTo method
     * 
     * @return <int>
     */
    public int compareTo(KyleBrewerMonth obj1) {
        if (this.Number < obj1.Number) {
            return -1;
        } else if (this.Number > obj1.Number) {
            return 1;
        } else {
            return 0;
        }
    }

}
