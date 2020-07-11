package question85;

public class Study {

  private char var;

  public static void main(String[] args) {
    //
    char var1 = 'a';
    char var2 = var1;
    var2 = 'e';

    Study s1 = new Study();
    Study s2 = s1;
    s1.var = 'i';
    s2.var = 'o';

    System.out.println(var1 + ", " + var2);
    System.out.println(s1.var + ", " + s2.var);
  }
}
/*
a, e
o, o
 */
