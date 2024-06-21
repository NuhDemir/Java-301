package ch002;

public class CarTest {
 public static void main(String[] args) {
    
 
    Car car1 = new Car();
    
    System.out.println("When the car stands still.");
    car1.make="Mercedes";
    car1.model ="C200";
    car1.year = "2019";
    car1.distance =0;
    car1.speed =0;

    String info = car1.getInfo();
    System.out.println(info);


    System.out.println("\nWhen the car moves. ");
    car1.accelerate(125);
    car1.go(100);
    car1.go(100);
    car1.go(100);
    System.out.println(car1.getInfo());
    car1.stop();
    System.out.println();

    Car car2 = new Car();

    System.out.println("When the car stands still.");
    car2.make="Toyota";
    car2.model ="Corolla";
    car2.year = "2019";
    car2.distance = 0;
    car2.speed=0;

    String info2 = car2.getInfo();
    System.out.println(info2);

   

 }
}
