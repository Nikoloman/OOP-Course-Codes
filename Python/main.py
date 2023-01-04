from car import Car
from account import Account

if __name__ == "__main__":
    print("Hello world")

    car = Car("ABC-123", Account("Oscar Cabrales", "OSC123"))
    car.id = 1
    car.passengers = 4

    print("The ID of the car is: " + str(car.id))
    print("The driver's name is: " + car.driver.name)
    print("The car's license is: " + car.license)
    print("The car has a capacity of " + str(car.passengers) + " passengers")
    print()

    car2 = Car("DEF-456", Account("Max Ledesma", "MAX456"))
    car2.id = 2
    car2.passengers = 5
    car2.printDataOfCar()