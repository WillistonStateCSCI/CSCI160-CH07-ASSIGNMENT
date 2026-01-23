/* Student Client
   Anderson, Franceschi
*/

public class StudentClient
{
  public static void main( String [] args )
  {
    Student s1 = new Student( "Jones", "222-88-1111", 3.7 );
    Student s2 = new Student( "Smith", "333-99-4444", 3.2 );
    System.out.println( "The name of student #1 is " + s1.getName( ) );
    System.out.println( "The social security number of student #1 is " + s1.getSSN( ) );
    System.out.println( "The GPA of student #1 is " + s1.getGPA( ) );
    System.out.println( "Student #2 is " + s2.toString( ) );

    if ( s1.equals( s2 ) )
      System.out.println( "Original students #1 and #2 are identical" );
    else
      System.out.println( "Original students #1 and #2 are different" );

    s2.setName( "Jones" ).setSSN( "222-88-1111" ).setGPA( 3.7 );
    
    if ( s1.equals( s2 ) )
      System.out.println( "Original student #1 and modified student #2 are identical" );
    else
      System.out.println( "Original student #1 and modified student #2 are different" );

  }
}