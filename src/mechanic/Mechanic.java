package mechanic;

import transport.Transport;

public class Mechanic {

    private final String fullName;
    private final String company;
    private final MechanicTransportType type;

    public Mechanic(String fullName, String company, MechanicTransportType type) {
        this.fullName = fullName;
        this.company = company;
        this.type = type;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCompany() {
        return company;
    }

    public MechanicTransportType getType() {
        return type;
    }

    public void doMaintenance() {
        System.out.println("Механик " + fullName + " проводит техобслуживание");
    }

    public void fixCar(Transport car) {
        System.out.println("Чиним машину: " + car.getBrand() + " " +
                car.getModel());
    }

    @Override
    public String toString() {
        return "Механик: " + fullName +
                "; компания: " + company +
                "; работает с типом авто: " + type.getName();
    }
}
