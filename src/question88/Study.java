package question88;

public class Study {

  public static void main(String[] args) {
    //
    String names[] = {"Thomas", "Peter", "Joseph"};
    String pws[] = new String[3];
    int idx = 0;
    try {
      for (String n : names) {
        // System.out.println(n);
        pws[idx] = n.substring(2, 6);
        idx++;
      }
    } catch (Exception e) {
      // e.printStackTrace();
      System.out.println("Invalid Name");
    }

    for (String p : pws) {
      System.out.println(p);
    }
  }
}

/*
Invalid Name
omas
null
null
 */
