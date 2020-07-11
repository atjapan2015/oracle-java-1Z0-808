package question36;

public class Study {

  public static void main(String[] args) {
    //
    int x = 100;
    int a = x++; // a = 100; x=101
    int b = ++x; // b = 102; x = 102;
    int c = x++; // c = 102; x = 103;
    int d = (a < b) ? (a < c) ? a : ((b < c) ? b : c) : c;
    System.out.println(d);
  }
}

/*
100
 */
