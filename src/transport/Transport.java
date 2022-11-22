package transport;

public abstract class Transport {
    private String brand;
    private String model;
    private double engineVolume;

    public Transport(String brand, String model, double engineVolume) {
        this.brand = Valid.validOrDefault(brand, "Информация не указана");
        this.model = Valid.validOrDefault(model, "Информация не указана");
        this.engineVolume = Math.max(engineVolume, 0);
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

    public abstract void startMoving();

    public abstract void finishTheMove();

    public abstract void printType();

    public abstract boolean service();
}