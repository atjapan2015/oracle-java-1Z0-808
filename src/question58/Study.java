package question58;

public class Study {

  public static void main(String[] args) {
    //
    String[][] arr = {{"A", "B", "C"}, {"D", "E"}};
    for (int i = 0; i < arr.length; i++) {
      // System.out.println(arr[i].length);
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + " ");
        if (arr[i][j].equals("B")) {
          break;
        }
      }
      continue;
    }
  }
}
/*
A B D E
 */
