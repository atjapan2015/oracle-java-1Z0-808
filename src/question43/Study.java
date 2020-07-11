package question43;

public class Study {

  public static void main(String[] args) {
    //
    String[] arr = {"A", "B", "C", "D"};
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
      if (arr[i].equals("C")) {
        continue;
      }
      System.out.println("Work done");
      break;
    }
  }
}
/*
A Work done
 */
