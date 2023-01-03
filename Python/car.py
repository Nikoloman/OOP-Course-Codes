class Car:
    def __init__(self) -> None:
        self.id          = int
        self.license     = str
        self.driver      = str
        self.passengers  = int
        pass
    

    def printDataOfCar(self):
        print("The ID of the car is: " + str(self.id))
        print("The driver's name is: " + self.driver)
        print("The car's license is: " + self.license)
        print("The car has a capacity of " + str(self.passengers) + " passengers")