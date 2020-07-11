package question17;

class Product {
  double price;
}

public class Study {

  public void updatePrice(Product product, double price) {
    price = price * 2;
    product.price = product.price + price;
  }

  public static void main(String[] args) {
    //
    Product prt = new Product();
    prt.price = 200;
    double newPrice = 100;

    Study s = new Study();
    s.updatePrice(prt, newPrice);
    System.out.println(prt.price + " : " + newPrice);
  }
}
/*
400.0 : 100.0
*/
