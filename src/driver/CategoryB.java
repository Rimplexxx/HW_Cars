package driver;

import transport.Car;

public class CategoryB extends Driver<Car>{

    public CategoryB(String fullName, String driverLicense, int experience, Car transport) {
        super(fullName, "B", experience, transport);
    }
}