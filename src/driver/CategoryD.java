package driver;

import transport.Bus;

public class CategoryD extends Driver<Bus>{
    public CategoryD(String fullName, String driverLicense, int experience, Bus transport) {
        super(fullName, "D", experience, transport);
    }
}