package question80;

public class Study {

  int id;
  String name;

  public Study(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public static void main(String[] args) {
    //
    Study s1 = new Study(101, "Pen");
    Study s2 = new Study(101, "Pen");
    Study s3 = s1;

    boolean ans1 = s1 == s2;
    boolean ans2 = s1.name.equals(s2.name);
    System.out.println(ans1 + ":" + ans2);
  }
}
/*
false:true
 */
