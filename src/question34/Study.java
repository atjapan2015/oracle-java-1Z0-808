package question34;

public class Study {

  public static void main(String[] args) {
    //
    // boolean opt = true;
    String opt = "true";
    /*
    Cannot switch on a value of type boolean. Only convertible int values, strings or enum variables are permitted
     */
    switch (opt) {
        // case true:
      case "true":
        System.out.print("True");
        break;
      default:
        System.out.print("***");
    }
    System.out.println("Done");
  }
}
