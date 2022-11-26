package mechanic;

public enum MechanicTransportType {

    CAR("Легковой автомобиль"),
    BUS("Автобус"),
    TRUCK("Грузовик"),
    ALL("Все автомобили");

    private String name;

    MechanicTransportType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
