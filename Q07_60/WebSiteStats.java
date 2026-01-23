/* WebSiteStats Class
   Anderson, Franceschi
*/

public class WebSiteStats
{
  private int visitors;
  private String type;

  /**
  * Constructor:<BR>
  * Allows client to set beginning values for visitors and type
  * This constructor takes two parameters<BR>
  * Calls mutator methods to validate new values
  * @param newVisitors the number of visitors of the web site
  * @param newType the type of the web site
  */
  public WebSiteStats( int newVisitors, String newType )
  {
    //Add your code here
  }

  /** getVisitors method
  * @return the number of visitors
  */
  public int getVisitors( )
  {
    //Add your code here
  }

  /**
  * Mutator method:<BR>
  * Allows client to set value of visitors
  * Does not change value if the new value is less than 0<BR>
  * @param visitors the new number of visitors
  * @return a reference to this object
  */
  public WebSiteStats setVisitors( int visitors )
  {
    //Add your code here
  }

  /** getType method
  * @return the type of the web site
  */
  public String getType( )
  {
    //Add your code here
  }

  /**
  * Mutator method:<BR>
  * Allows client to set value of type
  * @param type the new type
  * @return a reference to this object
  */
  public WebSiteStats setType( String type )
  {
    //Add your code here
  }

  /**
  * @return the type and number of visitors for the web site
  */
  public String toString( )
  {
    //Add your code here
  }

  /**
  * equals method
  * Compares two WebSiteStats objects for the same field values
  * @param o another WebSiteStats object
  * @return a boolean, true if this object
  * has the same field values as the parameter wss
  */
  public boolean equals( Object o )
  {
    //Add your code here
  }
}