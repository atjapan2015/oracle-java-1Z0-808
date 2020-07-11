package question89;

class A {
  public void test() {
    System.out.println("A");
  }
}

class B extends A {
  public void test() {
    System.out.println("B");
  }
}

public class Study extends A {
  public void test() {
    System.out.println("C");
  }

  public static void main(String[] args) {
    //
    A b1 = new A();
    A b2 = new Study();
    b1 = (A) b2;
    A b3 = (B) b2; // java.lang.ClassCastException
    //      A b3 = (B)b2;
    b1.test();
    b3.test();
  }
}
