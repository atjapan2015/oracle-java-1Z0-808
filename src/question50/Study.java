package question50;

public class Study {

  public static void main(String[] args) {
    //
    if (args[0].equals("Hello") ? false : true) {
      System.out.println("Success");
    } else {
      System.out.println("Failure");
    }
  }
}
/*
javac Study.java
java Study Hello

Failure
 */
