package driver;

import transport.Car;
import transport.Transport;

public class DriverB extends Driver<Car>{

    public DriverB(String fullName, int experience, Car transport) {
        super(fullName, "B", experience, transport);
    }

    @Override
    public String toString() {
        return getFullName() +
                "; категория прав: " + getDriverLicense() +
                "; стаж вождения: " + getExperience();
    }
}