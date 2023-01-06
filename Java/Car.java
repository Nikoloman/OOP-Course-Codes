package Java;

//Class car
public class Car {
    //Properties
    private Integer id;
    private String license;
    private Account driver;
    protected Integer passengers;

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
        if (passengers == 4){
            this.passengers = passengers;
        }
        else{
            System.out.println("It's nessesary to set 4 passengers");
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }


    
}
