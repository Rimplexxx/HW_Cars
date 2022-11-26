package transport;

public class Truck extends Transport implements Competing {

    private int bestLapTime;
    private int maxSpeed;
    private Weight weight;

    public Truck(String brand, String model, double engineVolume, int bestLapTime, int maxSpeed, Weight weight) {
        super(brand, model, engineVolume);
        this.bestLapTime = Math.max(bestLapTime, 0);
        this.maxSpeed = Math.max(maxSpeed, 0);
        this.weight = weight;
    }

    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
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
        if (weight == null) {
            System.out.println("Данных по авто недостаточно");
        } else {
            String from = weight.getFrom() == null ? "" : "от " + weight.getFrom() + " т., ";
            String to = weight.getTo() == null ? "" : "до " + weight.getTo() + " т.";
            System.out.println("Грузоподъемность авто: " + from + to);
        }
    }

    @Override
    public boolean service() {
        return Math.random()>0.7;
    }

    @Override
    public void repair() {
        System.out.println("Грузовик " + getBrand() + " " + getModel() +
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
        return "Грузовой автомобиль: " + getBrand() +
                " " + getModel() +
                "; объем двигателя: " + getEngineVolume();
    }
}