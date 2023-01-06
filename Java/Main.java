package Java;

class Main{
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println();

        UberX car = new UberX("ABC-123", new Account("Oscar Cabrales","OSC123"), "Volkswagen", "Vento");
        car.setId(1);
        car.setPassengers(4);

        System.out.println("The ID of the car is: " + car.getId());
        System.out.println("The driver's name is: " + car.getDriver().name);
        System.out.println("The car's license is: " + car.getLicense());
        System.out.println("The car has a capacity of " + car.getPassengers() + " passengers");
        System.out.println();

        UberX car2 = new UberX("DEF-456", new Account("Max Ledesma", "MAX456"), "Nissan", "Sentra");
        car2.setId(2);
        car2.setPassengers(4);

        System.out.println("The ID of the car is: " + car2.getId());
        System.out.println("The driver's name is: " + car2.getDriver().name);
        System.out.println("The car's license is: " + car2.getLicense());
        System.out.println("The car has a capacity of " + car2.getPassengers() + " passengers");
        System.out.println();

        UberVan car3 = new UberVan("GHI-789", new Account("Michel Ortiz", "MIC789"));
        car3.setId(3);
        car3.setPassengers(2);
        car3.printDataOfCar();
    }
}