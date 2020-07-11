package question59;

public class Study {

  public static void main(String[] args) {
    //
    String str = " ";
    str.trim();
    System.out.println(
        str.equals("")
            + " "
            + str.isEmpty()); //  the string is not empty, Java will reserve space in the heap.
  }
}
/*
false false
 */
