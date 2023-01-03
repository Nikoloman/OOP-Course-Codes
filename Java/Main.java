package Java;

class Main{
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println();

        Car car = new Car();
        car.id = 1;
        car.license = "ABC-123";
        car.driver = "Oscar Cabrales";
        car.passengers = 4;

        System.out.println("The ID of the car is: " + car.id);
        System.out.println("The driver's name is: " + car.driver);
        System.out.println("The car's license is: " + car.license);
        System.out.println("The car has a capacity of " + car.passengers + " passengers");
        System.out.println();

        Car car2 = new Car();
        car2.id = 2;
        car2.license = "DEF-456";
        car2.driver = "Max Ledesma";
        car2.passengers = 5;

        System.out.println("The ID of the car is: " + car2.id);
        System.out.println("The driver's name is: " + car2.driver);
        System.out.println("The car's license is: " + car2.license);
        System.out.println("The car has a capacity of " + car2.passengers + " passengers");
        System.out.println();

        Car car3 = new Car();
        car3.id = 3;
        car3.license = "GHI-789";
        car3.driver = "Michel Ortiz";
        car3.passengers = 2;
        car3.printDataOfCar();

    }
}