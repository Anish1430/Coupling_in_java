    //1= Start with Tightly Coupling .....


//     Dependency Object

//    class Car{
//    public void start() {
//        System.out.println("Start a trip with Car");
//    }
//  }
//   class Bike{
//       public void start() {
//           System.out.println("Start a trip with Bike");
//       }
//   }

//    Dependent Object
//   public class Main {
//      static Car c=new Car();  //Hardcoded in Dependency object.
//       static  Bike b=new Bike();  //Everytime we can call an object it will not be dependent on each other.
//   public static void main(String[] args) {
              // c.start();
            //  b.start();


    // 2= Start with Loose Coupling


//  //Dependent Object...
//    public class Main {
//          static  Car c=new Car(); //Hardcoded in Dependency object.
//       static  Bike b=new Bike();  //Everytime we can call an object it will not be dependent on each other.
//        public static void main(String[] args) {
//                c.Start();
//                b.startJourney();
//               /* In the above example, there is a strong inter-dependency between both the classes.
//               If there is any change in Bike class then they reflects in the result of Class Main.
//               */



    //Dependent object of Loosely Coupled.
    public class Main {
       static Vehicle v;

       //With the help of Setter method in java
         public void setVehicle(Vehicle v) {
              this.v=v;
         }

    public static void main(String[] args) {

              Main t=new Main();  // Create a Main method Object because for loose coupling.
              t.setVehicle(new Bike());    //it will Comes from bike class
              v.start();
              t.setVehicle(new Car());     //it will Comes from car class
                v.start();
               t.setVehicle(new Train());   //it will Comes from train class
                 v.start();
        }
    }