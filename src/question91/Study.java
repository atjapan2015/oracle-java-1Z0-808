package question91;

public class Study {

  void readCard(int cardNo) throws Exception {
    System.out.println("Reading Crad");
  }

  void checkCard(int cardNo) throws RuntimeException {
    System.out.println("Checking Card");
  }

  public static void main(String[] args) {
    //
    Study s = new Study();
    int cardNo = 12344;
    s.checkCard(cardNo);
    // Unhandled exception: java.lang.Exception
    // s.readCard(cardNo);
  }
}
