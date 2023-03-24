package chapter6;

public class Rectangle {
    
    //fields

    private double length;
    private double width;


    /*
     * constructors
     */
    public Rectangle(double newLength, double newWidth) {
        length = newLength;
        width = newWidth;

    }

     /*
      * no-param/default constructor
      */
      public Rectangle(){
        length = 0;
        width = 0;
      }

    /*
     * setters
     */
    public void setLength(double newLength){
        length = newLength;
    }

    public void setWidth(double newWidth){
        width = newWidth;
    }

    /*
     * getter functions
     */
    
     public double getWidth(){
        return width;
     }

     public double getLength(){
        return length;
     }
}
