package question90;

import java.util.ArrayList;

abstract class Animal {}

interface Hunter {}

class Cat extends Animal implements Hunter {}

class Tiger extends Cat {}

public class Study {

  public static void main(String[] args) {
    //
    ArrayList<Tiger> myList = new ArrayList<>();
    // myList.add(new Cat());
  }
}
