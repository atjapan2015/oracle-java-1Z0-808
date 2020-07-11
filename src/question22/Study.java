package question22;

import java.io.IOException;

class X {
  public void printFileContent() throws IOException {
    /* code goes here */
    throw new IOException();
  }
}

public class Study {

  public static void main(String[] args) throws Exception {
    //
    X xobj = new X();
    xobj.printFileContent();
  }
}
