package question1;

public class CheckingAccount {

  public int amount;

  // line n1
  // answer D
  //  public CheckingAccount() {
  //    amount = 100;
  //  }

  // answer E
  //  public CheckingAccount() {
  //    this.amount = 100;
  //  }
  // answer F
  //  public CheckingAccount() {
  //    acct.amount = 100;
  //  }

  public static void main(String[] args) {
    CheckingAccount acct = new CheckingAccount();
    // line n2

    // answer A
    // amount = 100;

    // answer B
    // This.amount = 100;

    // answer C
    //    acct.amount = 100;
    //    System.out.println(acct.amount);

    // answer D
    // System.out.println(acct.amount);

    // answer E
    System.out.println(acct.amount);
  }
}
