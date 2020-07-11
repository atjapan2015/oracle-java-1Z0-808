package question41;

public class Study {
  static int i;
  int j;

  public static void main(String[] args) {
    //
    Study s1 = new Study();
    Study s2 = new Study();
    s1.i = 3;
    s1.j = 4;
    s2.i = 5;
    s2.j = 6;
    System.out.println(s1.i + " " + s1.j + " " + s2.i + " " + s2.j);
  }
}
/*
5 4 5 6
 */
