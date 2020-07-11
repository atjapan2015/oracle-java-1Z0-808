package question75;

public class Study {

  public static void main(String[] args) {
    //
    // Byte x = 1;
    // short x = 1;
    Integer x = new Integer("1");
    switch (x) {
      case 1:
        System.out.println("One");
        break;
      case 2:
        System.out.println("Two");
        break;
    }
  }
}
