package question69;

public class Study {

  public String name;
  public int moons;

  public Study(String name, int moons) {
    this.name = name;
    this.moons = moons;
  }

  public static void main(String[] args) {
    //
    Study[] studys = {
      new Study("Mercury", 0), new Study("Venus", 0), new Study("Earth", 1), new Study("Mars", 2)
    };
    System.out.println(studys);
    System.out.println(studys[2]);
    System.out.println(studys[2].moons);
  }
}

/*
[Lquestion69.Study;@135fbaa4
question69.Study@45ee12a7
1
*/
