package Java;

public class UberX extends Car{
    String brand;
    String model;

    public UberX(String license, Account driver, String brand, String model){
        super(license, driver);
        this.brand = brand;
        this.model = model;
    }

    @Override
    public void setDriver(Account driver) {
        super.setDriver(driver);
        System.out.println("Modelo: " + model + " Brand: " + brand);
    }
}
