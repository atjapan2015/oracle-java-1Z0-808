package question19;

public class Study {

  public static void main(String[] args) {
    //
    Short s1 = 200;
    Integer s2 = 400;
    Long s3 = (long) s1 + s2; // line n1
    System.out.println(s3);
    // Inconvertible types; cannot cast 'long' to 'java.lang.String'
    // String s4 = (String) (s3 * s2); // line n2
    // System.out.println("Sum is " + s4);
    Long s5 = 100L;
    System.out.println((String.valueOf(s5)));
    /*
    100
     */
    System.out.println(s5.toString());
    /*
    100
     */
  }
}
