package Java;

//Class car
public class Car {
    //Properties
    Integer id;
    String license;
    Account driver;
    private Integer passengers;

    //Constructor
    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
    }

    //Method
    void printDataOfCar(){
        System.out.println("The ID of the car is: " + id);
        System.out.println("The driver's name is: " + driver.name);
        System.out.println("The car's license is: " + license);
        System.out.println("The car has a capacity of " + passengers + " passengers");
    }

    //Getter
    public Integer getPassengers(){
        return passengers;
    }

    //Setter
    public void setPassengers(Integer passengers){
        this.passengers = passengers;
    }
}
