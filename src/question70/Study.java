package question70;

import java.util.Arrays;

public class Study {

  public static void main(String[] args) {
    //
    int[] intArr = {15, 30, 45, 60, 75};
    intArr[2] = intArr[4];
    intArr[4] = 90;
    Arrays.stream(intArr).forEach(i -> System.out.print(i + " "));
  }
}
/*
15 30 75 60 90
 */
