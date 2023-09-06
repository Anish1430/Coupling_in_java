    //Dependency Object
    class Car{
    public void start() {
        System.out.println("Start a trip with Car");
    }
  }
   class Bike{
       public void start() {
           System.out.println("Start a trip with Bike");
       }
   }

   //Dependent Object
    public class Traveller {
       // static Car c=new Car();  //Hardcoded in Dependency object.
       static  Bike b=new Bike();  //Everytime we can call an object it will not be dependent on each other.
        public static void main(String[] args) {
              // c.start();
              b.start();
        }
    }