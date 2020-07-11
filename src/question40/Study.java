package question40;

class A {
  public A() {
    System.out.print("A ");
  }
}

class B extends A {
  public B() { // line n1
    System.out.print("B ");
  }
}

class C extends B {
  public C() { // line n2
    System.out.print("C ");
  }
}

public class Study {
  public static void main(String[] args) {
    //
    C c = new C();
  }
}
/*
A B C
 */
