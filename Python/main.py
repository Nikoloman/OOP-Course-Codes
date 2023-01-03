from car import Car

if __name__ == "__main__":
    print("Hello world")

    car = Car()
    car.id = 1
    car.license = "ABC-123"
    car.driver = "Oscar Cabrales"
    car.passengers = 4

    print("The ID of the car is: " + str(car.id))
    print("The driver's name is: " + car.driver)
    print("The car's license is: " + car.license)
    print("The car has a capacity of " + str(car.passengers) + " passengers")
    print()

    car2 = Car()
    car2.id = 2
    car2.license = "DEF-456"
    car2.driver = "Max Ledesma"
    car2.passengers = 5
    car2.printDataOfCar()