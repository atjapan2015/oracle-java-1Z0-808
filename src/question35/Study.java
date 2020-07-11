package question35;

public class Study {

  public static void main(String[] args) {
    //
    int num = 5;
    do {
      System.out.print(num-- + "");
    } while (num == 0); // not (num <= 0)
  }
}

/*
5
 */
