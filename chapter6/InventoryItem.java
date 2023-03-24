package chapter6;

public class InventoryItem {
    
    String description = "";
    int units=0;


    /*Construcntor for description */

    public InventoryItem()
    {
        description = "";
        units= 0;
    }
    public InventoryItem(String newDescription)
    {
        description = newDescription;
        units = 0;
    }

    public InventoryItem(int newUnits){
        units = newUnits;
        description = "";
    }

    //constructor for all fields 
    public InventoryItem(String newDescription, int newUnits)
    {
        description = newDescription;
        units = newUnits;
    }

    public void set(String newDescription, int newUnits){
        description = newDescription;
        units = newUnits;
    }

    public String getDescription(){
        return description;
    }

    public int getUnits(){
        return units;
    }

    /*
     * display message with values
     */

     public void Display(String message){
        System.out.printf("Inventory Item %s with descriptions %s has %d units in stock\n\n",
         message, description, units);
    }

    

}
