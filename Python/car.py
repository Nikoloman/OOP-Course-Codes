from account import Account

class Car:
    id          = int
    license     = str
    driver      = Account("","")
    passengers  = int
    pass

    def __init__(self, license, driver):
        self.license = license
        self.driver = driver

    def printDataOfCar(self):
        print("The ID of the car is: " + str(self.id))
        print("The driver's name is: " + self.driver.name)
        print("The car's license is: " + self.license)
        print("The car has a capacity of " + str(self.passengers) + " passengers")