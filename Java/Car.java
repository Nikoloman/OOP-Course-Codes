package Java;

//Class car
public class Car {
    //Properties
    Integer id;
    String license;
    String driver;
    Integer passengers;

    //Method
    void printDataOfCar(){
        System.out.println("The ID of the car is: " + id);
        System.out.println("THe driver's name is: " + driver);
        System.out.println("The car's license is: " + license);
        System.out.println("The car has a capacity of " + passengers + " passengers");
    }
}
