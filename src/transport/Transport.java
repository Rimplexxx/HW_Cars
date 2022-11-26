package transport;

import driver.Driver;
import mechanic.Mechanic;
import sponsor.Sponsor;

import java.util.ArrayList;
import java.util.List;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final double engineVolume;
    private final List<Driver<?>> drivers = new ArrayList<>();
    private final List<Sponsor> sponsors = new ArrayList<>();
    private final List<Mechanic> mechanics = new ArrayList<>();

    public Transport(String brand, String model, double engineVolume) {
        this.brand = Valid.validOrDefault(brand, "Информация не указана");
        this.model = Valid.validOrDefault(model, "Информация не указана");
        this.engineVolume = Math.max(engineVolume, 0);
    }

    public List<Driver<?>> getDrivers() {
        return drivers;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }

    public List<Mechanic> getMechanics() {
        return mechanics;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void addSponsor(Sponsor sponsor) {
        this.sponsors.add(sponsor);
    }

    public void addMechanic(Mechanic mechanic) {
        this.mechanics.add(mechanic);
    }

    public void addDriver(Driver<?> driver) {
        this.drivers.add(driver);
    }

    public abstract void startMoving();

    public abstract void finishTheMove();

    public abstract void printType();

    public abstract boolean service();

    public abstract void repair();
}