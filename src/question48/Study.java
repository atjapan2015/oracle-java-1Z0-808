package question48;

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
    s2.changeCount();
    System.out.println(s1.count + " : " + s2.count);
  }
}
/*
10 : 10
 */
