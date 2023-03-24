package chapter6;

public class Stock {
    
    //fields
    private String symbol;
    private float price;

    /*
     * constructor 
     */
    public Stock()
    {
        symbol="";
        price=0;

    }

    // copy constructor
    public Stock(Stock oject_two)
    {
        symbol = oject_two.symbol;
        price = oject_two.price;
    }


    public Stock (String newSymbol, float newPrice)
    {
        symbol = newSymbol;
        price= newPrice;

    }

    public void set (String newSymbol, float newPrice)
    {
        symbol = newSymbol;
        price = newPrice;

    }


    public String getSymbol()
    {
        return symbol;
    }

    public float getPrice()
    {
        return price;
    }

    //override the toString method

    public String toString()
    {
        String s= "\n\tTrading symbol: "+ symbol+
        "\n\tShare price= "+price;
        return s;
    }

    public static void compareStock(Stock stock, Stock stock_two)
    {
        if (stock.symbol.equals(stock_two.symbol))
        {
            if (stock.price == stock_two.price){
                System.out.println("\nThese two stock are equal");
                System.out.println("\n\tstock_one: "+ stock.symbol + " price: "+ stock.price +
             "\n\tStock_two: "+ stock_two.symbol + " price: " + stock_two.price );
            }
            
        }
        else
        {   
            System.out.println("\n\tstock_one: "+ stock.symbol + " price: "+ stock.price +
             "\n\tStock_two: "+ stock_two.symbol + " price: " + stock_two.price );
            System.out.println("\n\tThese Stocks are not equal");
            
        }
    }

    //copy method to create a deep copy of the object.

    public Stock copy()
    {
        // create a new object with the same field values
        Stock copyObject = new Stock(symbol, price);

        //return it
        return copyObject;

    }

    public void output()
    {
        System.out.println("STOCK = " + toString());
    }
}
