package question73;

public class Study {

  int num;

  public static void graceMarks(Study obj4) {
    obj4.num += 10;
  }

  public static void main(String[] args) {
    //
    Study obj1 = new Study();
    Study obj2 = obj1;
    Study obj3 = null;
    obj2.num = 60;
    graceMarks(obj2);
  }
}
/*
how many Study instances are creatged in memory at runtime?
Answer:1
 */
