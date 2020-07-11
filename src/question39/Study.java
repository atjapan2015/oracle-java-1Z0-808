package question39;

import java.util.ArrayList;
import java.util.List;

public class Study {
  public static void main(String[] args) {
    //
    List<String> names = new ArrayList<>();
    names.add("Robb");
    names.add("Bran");
    names.add("Rick");
    names.add("Bran");

    /*
    Removes the first occurrence of the specified element from this list, if it is present (optional operation).
     */
    if (names.remove("Bran")) {
      names.remove("Jon");
    }
    System.out.println(names);
  }
}

/*
[Robb, Rick, Bran]
 */
