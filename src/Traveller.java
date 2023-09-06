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
//   public class Traveller {
//      static Car c=new Car();  //Hardcoded in Dependency object.
//       static  Bike b=new Bike();  //Everytime we can call an object it will not be dependent on each other.
//   public static void main(String[] args) {
              // c.start();
            //  b.start();


    // 2= Start with Loose Coupling


//  //Dependent Object...
//    public class Traveller {
//          static  Car c=new Car(); //Hardcoded in Dependency object.
//       static  Bike b=new Bike();  //Everytime we can call an object it will not be dependent on each other.
//        public static void main(String[] args) {
//                c.Start();
//                b.startJourney();
//               /* In the above example, there is a strong inter-dependency between both the classes.
//               If there is any change in Bike class then they reflects in the result of Class Traveller.
//               */

    public class Traveller{
    public static void main(String[] args) {
           Bike b=new Bike();
              b.startJourney();
        }
    }