package question27;

class CD {
  int r;

  CD(int r) {
    this.r = r;
  }
}

class DVD extends CD {
  int c;

  DVD(int r, int c) {
    // line n1
    super(r);
    this.c = c;
  }
}

public class Study {

  public static void main(String[] args) {
    //
    DVD dvd = new DVD(10, 20);
  }
}
