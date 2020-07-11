package question65;

public class Study {

  public static void main(String[] args) {
    int iVar = 100;
    float fVar = 100.100f;
    double dVar = 123;
    // which three lines fail to compile
    //    iVar = fVar;
    //    fVar = iVar;
    //    dVar = fVar;
    //    fVar = dVar;
    //    dVar = iVar;
    //    iVar = dVar;
  }
}
