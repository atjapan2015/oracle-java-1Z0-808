package question78;

public class Study {

  String myStr = "7007";

  public void doStuff(String str) {
    int myNum = 0;
    try {
      String myStr = str;
      myNum = Integer.parseInt(myStr);
    } catch (NumberFormatException ne) {
      System.err.println("Error");
    }
    System.out.println("myStr: " + myStr + ", myNum:" + myNum);
  }

  public static void main(String[] args) {
    Study s = new Study();
    s.doStuff("9009");
  }
}
/*
myStr: 7007, myNum:9009
 */
