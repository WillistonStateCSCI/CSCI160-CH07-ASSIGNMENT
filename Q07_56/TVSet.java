/* TVSet Class
   Anderson, Franceschi
*/
import java.text.NumberFormat;

public class TVSet
{
  public final NumberFormat money = NumberFormat.getCurrencyInstance( );
  private String brand;
  private double price;

  /**
  * Constructor:<BR>
  * Allows client to set beginning values for brand and price
  * This constructor takes two parameters<BR>
  * Calls mutator methods to validate new values
  * @param newBrand the brand of the TV set
  * @param newPrice the price of the TV set
  */
  public TVSet( String newBrand, double newPrice )
  {
    //Add your code here
  }

  /** getBrand method
  * @return the brand
  */
  public String getBrand( )
  {
    //Add your code here
  }

  /**
  * Mutator method:<BR>
  * Allows client to set value of brand
  * @param brand the new brand
  * @return a reference to this object
  */
  public TVSet setBrand( String brand )
  {
    //Add your code here
  }

  /** getPrice method
  * @return the price
  */
  public double getPrice( )
  {
    //Add your code here
  }

  /**
  * Mutator method:<BR>
  * Allows client to set value of price
  * Does not change the value if new value is less than 0<BR>
  * @param price the new price
  * @return a reference to this object
  */
  public TVSet setPrice( double price )
  {
    //Add your code here
  }

  /**
  * @return the brand and price of the TV set
  */
  public String toString( )
  {
    //Add your code here
  }

  /**
  * equals method
  * Compares two TVSet objects for the same field values
  * @param o another TVSet object
  * @return a boolean, true if this object
  * has the same field values as the parameter tvs
  */
  public boolean equals( Object o )
  {
    //Add your code here
  }
}