package question52;

public class Study {
  public static String maskCC(String creditCard) {
    String x = "XXXX-XXXX-XXXX-";
    // line n1
    // answer 1
    /*StringBuilder sb = new StringBuilder(creditCard);
    sb.substring(15, 19);
    return x + sb;*/
    // answer 2
    // return x + creditCard.substring(15, 19);
    // answer 3
    StringBuilder sb = new StringBuilder(x);
    sb.append(creditCard, 15, 19);
    return sb.toString();
  }

  public static void main(String[] args) {
    System.out.println(maskCC("1234-5678-9101-1121"));
  }
}
