package question77;

public class Study {

  public static void main(String[] args) {
    //
    try {
      method1();
    } catch (MyException e) {
      System.out.print("A");
    }
  }

  public static void method1() {
    try {
      throw Math.random() > 0.5 ? new MyException() : new RuntimeException();
    } catch (RuntimeException e) {
      System.out.print("B");
    }
  }
}
/*
B
 */
