package question30;

public class Study {

  public int amount;

  public Study(int amount) {
    this.amount = amount;
  }

  public int getAmount() {
    return amount;
  }

  public void changeAmount(int x) {
    amount += x;
  }

  public static void main(String[] args) {
    Study s = new Study((int) (Math.random() * 1000));
    // line n1
    // this.amount = 0; // 'question30.Study.this' cannot be referenced from a static context
    // answer 1
    s.amount = 0;
    // answer 2;
    s.changeAmount(-s.amount);
    // answer 3;
    s.changeAmount(-s.getAmount());
    System.out.println(s.getAmount());
  }
}
