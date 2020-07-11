package question20;

abstract class Planet {
  protected void revolve() { // line n1
  }

  abstract void rotate(); // line n2
}

class Earth extends Planet {
  /*
  'revolve()' in 'question20.Earth' clashes with 'revolve()' in 'question20.Planet';
  attempting to assign weaker access privileges ('package-private'); was 'protected'
   */
  // add protected or public
  protected void revolve() { // line n3
  }

  protected void rotate() { // line n4
  }
}

public class Study {}
