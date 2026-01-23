/* Student Class
   Anderson, Franceschi
*/
import java.text.DecimalFormat;

public class Student
{
  private DecimalFormat oneDecimal = new DecimalFormat( "0.0" );
  private String name;
  private String ssn;
  private double gpa;

  /**
  * Constructor:<BR>
  * Allows client to set beginning values for name,
      ssn, and gpa
  * This constructor takes three parameters<BR>
  * Calls mutator methods to validate new values
  * @param newName the name of the student
  * @param newSsn the ssn of the student
  * @param newGpa the gpa of the student
  */
  public Student( String newName, String newSsn, double newGpa )
  {
    //Add your code here
  }

  /** getName method
  * @return the name
  */
  public String getName( )
  {
    //Add your code here
  }

  /**
  * Mutator method:<BR>
  * Allows client to set value of name
  * @param name the new name
  * @return a reference to this object
  */
  public Student setName( String name )
  {
    //Add your code here
  }

  /** getSsn method
  * @return the social security number
  */
  public String getSSN( )
  {
    //Add your code here
  }

  /**
  * Mutator method:<BR>
  * Allows client to set value of ssn
  * @param ssn the new Social Security Number
  * @return a reference to this object
  */
  public Student setSSN( String ssn )
  {
    //Add your code here
  }

  /** getGpa method
  * @return the gpa
  */
  public double getGPA( )
  {
    //Add your code here
  }

  /**
  * Mutator method:<BR>
  * Allows client to set value of gpa
  * Does not change value if new value is either less than 0
  *   or greater than 4.0<BR>
  * @param gpa the new Grade Point Average
  * @return a reference to this object
  */
  public Student setGPA( double gpa )
  {
    //Add your code here
  }
  /**
  * @return the name, social security number, and gpa for the student
  */
  public String toString( )
  {
    //Add your code here
  }

  /**
  * equals method
  * Compares two Student objects for the same field values
  * @param o another Student object
  * @return a boolean, true if this object
  * has the same field value as the parameter s
  */
  public boolean equals( Object o )
  {
  //Add your code here
  }
}