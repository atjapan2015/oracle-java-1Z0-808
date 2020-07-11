package question25;

interface Readable {
  public void readBook();

  public void setBookMark();
}

abstract class Book implements Readable { // line n1
  public void readBook() {}

  // line n2
}

// abstract class EBook extends Book { // line n3
class EBook extends Book { // line n3
  public void readBook() {}
  // line n4
  public void setBookMark() {}
}

public class Study {}
