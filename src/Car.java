  //Start With Tightly Coupling

  //Dependency Object
  public class Car implements Vehicle{
      @Override
      public void start() {
          System.out.println("Start with loose Coupling in car");
      }
  }
