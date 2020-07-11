package question24;

public class Study {

  public static void main(String[] args) {
    //
    StringBuilder sb = new StringBuilder(5);
    String s = "";

    /*
    StringBuilder int constructor takes an int and creates empty obj with the int as a capacity.
     */
    if (sb.equals(s)) {
      System.out.println("Match 1");
    } else if (sb.toString().equals(s.toString())) {
      System.out.println("Match 2");
    } else {
      System.out.println("No Match");
    }
  }
}
