package question82;

class Caller {
  private void init() {
    System.out.println("Initialized");
  }

  private void start() {
    init();
    System.out.println("Started");
  }
}

public class Study {
  public static void main(String[] args) {
    Caller s = new Caller();
    // 'start()' has private access in 'question82.Caller'
    // s.start();
    // 'init()' has private access in 'question82.Caller'
    // s.init();
  }
}
