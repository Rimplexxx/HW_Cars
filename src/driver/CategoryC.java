package driver;

import transport.Truck;

public class CategoryC extends Driver<Truck> {

    public CategoryC(String fullName, String driverLicense, int experience, Truck transport) {
        super(fullName, "C", experience, transport);
    }
}