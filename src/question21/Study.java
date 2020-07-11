package question21;

class Vehicle {
  String type = "4W";
  int maxSpeed = 100;

  Vehicle(String type, int maxSpeed) {
    this.type = type;
    this.maxSpeed = maxSpeed;
  }
}

class Car extends Vehicle {
  String trans;

  /*
  There is no default constructor available in 'question21.Vehicle'
   */
  /*Car(String trans) { // line n1
    this.trans = trans;
  }*/

  /*
  Call to 'this()' must be first statement in constructor body
   */
  Car(String type, int maxSpeed, String trans) {
    super(type, maxSpeed);
    // this(trans);
  }
}

public class Study {}
