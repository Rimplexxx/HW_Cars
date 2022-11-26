package driver;

import transport.Bus;

public class DriverD extends Driver<Bus>{
    public DriverD(String fullName, int experience, Bus transport) {
        super(fullName, "D", experience, transport);
    }

    @Override
    public String toString() {
        return getFullName() +
                "; категория прав: " + getDriverLicense() +
                "; стаж вождения: " + getExperience();
    }
}