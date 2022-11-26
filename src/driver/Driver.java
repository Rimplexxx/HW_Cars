package driver;

import transport.Car;
import transport.Transport;
import transport.Truck;
import transport.Valid;

public abstract class Driver<T extends Transport> {

    private String fullName;
    private String driverLicense;
    private int experience;
    private T transport;

    public Driver(String fullName, String driverLicense, int experience, T transport) {
        this.fullName = Valid.validOrDefault(fullName, "Информация не указана");
        this.experience = Math.max(experience, 0);
        this.transport = transport;
        setDriverLicense(driverLicense);
    }

    public void setDriverLicense(String driverLicense) {
        if (driverLicense == null) {
            throw new IllegalArgumentException("Необходимо указать категорию прав!");
        }
        this.driverLicense = driverLicense;
    }

    public String getFullName() {
        return fullName;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void startMoving() {
        System.out.println("Водитель " + fullName + " начал движение");
    }

    public void stay() {
        System.out.println("Водитель " + fullName + " остановился");
    }

    public void refuel() {
        System.out.println("Водитель " + fullName + " заправил автомобиль" + transport.getBrand() +
                " " + transport.getBrand());
    }

    @Override
    public String toString() {
        return "Водитель: " + fullName +
                " управляет автомобилем " + transport.getBrand() +
                " " + transport.getModel() +
                " и будет участвовать в заезде";
    }
}