package question84;

public class Study {

  int x;
  int y;

  public void doStuff(int x, int y) {
    this.x = x;
    y = this.y;
  }

  public void display() {
    System.out.println(x + " " + y + " ");
  }

  public static void main(String[] args) {
    //
    Study s1 = new Study();
    s1.x = 100;
    s1.y = 200;

    Study s2 = new Study();
    s2.doStuff(s1.x, s1.y);

    s1.display();
    s2.display();
  }
}
/*
100 200
100 0
 */
