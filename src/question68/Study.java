package question68;

public class Study {

  String name;
  int age = 25;

  public Study(String name) {
    /*
    Cannot resolve method 'this()'
     */
    // this(); // line n1
    this.name = name;
  }

  public Study(String name, int age) {
    /*
    Method call expected
     */
    // Study(name); // line n2
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public static void main(String[] args) {
    //

  }
}
