package question8;

public class Test {
  public static void main(String[] args) {
    //
    int[] stack = {10, 20, 30};
    int size = 3;
    int idx = 0;
    /* line n1 */
    do {
      idx++;
    } while (idx < size - 1);
    System.out.println("The top element:" + stack[idx]);
  }
}
