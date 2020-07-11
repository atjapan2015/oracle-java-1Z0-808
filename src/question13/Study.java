package question13;

public class Study {

  static int count = 0;
  int i = 0;

  public void changeCount() {
    while (i < 5) {
      i++;
      count++;
    }
  }

  public static void main(String[] args) {
    //
    Study s1 = new Study();
    Study s2 = new Study();
    s1.changeCount();
    // i = 0, count = 0
    // i = 5, count = 5
    s2.changeCount();
    // i = 0, count = 5
    // i = 5, count = 10
    System.out.println(s1.count + ":" + s2.count);
    // 10:10
  }
}
