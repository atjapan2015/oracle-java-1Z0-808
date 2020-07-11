package question72;

public class Study {

  public static void main(String[] args) {
    //
    int var1 = 200;
    System.out.print(doCalc(var1));
    System.out.print(" " + var1);
  }

  static int doCalc(int var1) {
    var1 = var1 * 2;
    return var1;
  }
}
/*
400 200
 */
