package driver;

import transport.Truck;

public class DriverC extends Driver<Truck> {

    public DriverC(String fullName, int experience, Truck transport) {
        super(fullName, "C", experience, transport);
    }

    @Override
    public String toString() {
        return getFullName() +
                "; категория прав: " + getDriverLicense() +
                "; стаж вождения: " + getExperience();
    }
}