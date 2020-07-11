package question60;

public class Study {

  public static void main(String[] args) {
    //
    String str1 = "Java";
    String str2 = new String("java");
    // line n1
    if (str1.equalsIgnoreCase(str2)) {
      System.out.println("Equal");
    } else {
      System.out.println("Not Equal");
    }
  }
}
/*
Equal
 */
