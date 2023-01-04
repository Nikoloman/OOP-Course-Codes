package Java;

class Main{
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println();

        Car car = new Car("ABC-123", new Account("Oscar Cabrales","OSC123"));
        car.id = 1;
        car.passengers = 4;

        System.out.println("The ID of the car is: " + car.id);
        System.out.println("The driver's name is: " + car.driver.name);
        System.out.println("The car's license is: " + car.license);
        System.out.println("The car has a capacity of " + car.passengers + " passengers");
        System.out.println();

        Car car2 = new Car("DEF-456", new Account("Max Ledesma", "MAX456"));
        car2.id = 2;
        car2.passengers = 5;

        System.out.println("The ID of the car is: " + car2.id);
        System.out.println("The driver's name is: " + car2.driver.name);
        System.out.println("The car's license is: " + car2.license);
        System.out.println("The car has a capacity of " + car2.passengers + " passengers");
        System.out.println();

        Car car3 = new Car("GHI-789", new Account("Michel Ortiz", "MIC789"));
        car3.id = 3;
        car3.passengers = 2;
        car3.printDataOfCar();

    }
}