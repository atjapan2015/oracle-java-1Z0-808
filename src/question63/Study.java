package question63;

class Vehicle {
  int x;

  Vehicle() {
    this(10); // line n1
  }

  Vehicle(int x) {
    this.x = x;
  }
}

class Car extends Vehicle {
  int y;

  Car() {
    super();
    /*
    Call to 'this()' must be first statement in constructor body
     */
    // this(20); // line n2
  }

  Car(int y) {
    this.y = y;
  }

  public String toString() {
    return super.x + ":" + this.y;
  }
}

public class Study {

  public static void main(String[] args) {
    //
    Vehicle y = new Car();
    System.out.println(y);
  }
}
