package question38;

public class Study {

  String name;
  boolean contract;
  double salary;

  Study() {
    // line n1
    /*name = "Joe";
    contract = true;
    salary = 100.0f;*/
    this.name = new String("joe");
    this.contract = new Boolean(true);
    this.salary = new Double(100);
  }

  public String toString() {
    return name + ":" + contract + ":" + salary;
  }

  public static void main(String[] args) {
    //
    Study s = new Study();
    // line n2
    System.out.print(s);
  }
}
