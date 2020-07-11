package Question32;

public class Study {

  void readCard(int cardNo) throws Exception {
    System.out.println("Reading Card");
  }

  void checkCard(int cardNo) throws RuntimeException { // line n1
    System.out.println("Checking Card");
  }

  public static void main(String[] args) {
    Study s = new Study();
    int cardNo = 12344;
    s.checkCard(cardNo); // line n2
    /*
    Unhandled exception: java.lang.Exception
     */
    // s.readCard(cardNo); // line n3
  }
}
