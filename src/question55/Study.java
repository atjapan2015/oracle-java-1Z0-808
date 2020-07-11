package question55;

import java.util.ArrayList;

public class Study {

  public static void main(String[] args) {
    //
    ArrayList myList = new ArrayList();
    String[] myArray;
    try {
      while (true) {
        myList.add("My String");
      }
    } catch (RuntimeException re) {
      System.out.println("Caught a RuntimeException");
    } catch (Exception e) {
      System.out.println("Caught an Exception");
    }
    System.out.println("Ready to use");
  }
}
/*
Exception in thread “main” java.lang.OutOfMemoryError: Java heap space
at java.util.Arrays.copyOf(Arrays.java:3210)
at java.util.Arrays.copyOf(Arrays.java:3181)
at java.util.ArrayList.grow(ArrayList.java:265)
at java.util.ArrayList.ensureExplicitCapacity(ArrayList.java:239)
at java.util.ArrayList.ensureCapacityInternal(ArrayList.java:231)
at java.util.ArrayList.add(ArrayList.java:462)
at q074.Test.main(Test.java:11)
 */
