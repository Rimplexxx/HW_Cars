package transport;

public class Bus extends Transport implements Competing {

    private int bestLapTime;
    private int maxSpeed;
    private Capacity capacity;

    public Bus(String brand, String model, double engineVolume, int bestLapTime, int maxSpeed, Capacity capacity) {
        super(brand, model, engineVolume);
        this.bestLapTime = Math.max(bestLapTime, 0);
        this.maxSpeed = Math.max(maxSpeed, 0);
        this.capacity = capacity;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    @Override
    public void startMoving() {
        System.out.println("Начинает движение");
    }

    @Override
    public void finishTheMove() {
        System.out.println("Заканчивает движение");
    }

    @Override
    public void printType() {
        if (capacity == null) {
            System.out.println("Данных по авто недостаточно");
        } else {
            System.out.println("Вместимость автобуса: от " + capacity.getFrom() + " человек, до " + capacity.getTo() + " человек");
        }
    }

    @Override
    public boolean service() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " в диагностике не требуется");
        return true;
    }

    @Override
    public void repair() {
        System.out.println("Автобус " + getBrand() + " " + getModel() +
                " починен");
    }

    @Override
    public void getPitStop() {
        System.out.println(getBrand() + " " + getModel() +
                " - приехала на пит-стоп, выполнили диагностику");
    }

    @Override
    public int getBestLapTime() {
        return bestLapTime;
    }

    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void result() {
        System.out.println("Максимальная скорость: " + getMaxSpeed() +
                " км/ч; Лучшее время круга: " + getBestLapTime() +
                " мин");
    }

    @Override
    public String toString() {
        return "Автобус: " + getBrand() +
                " " + getModel() +
                "; объем двигателя: " + getEngineVolume();
    }
}