package transport;

public class Car extends Transport implements Competing{

    private int bestLapTime;
    private int maxSpeed;
    private TypeOfBody typeOfBody;

    public Car(String brand, String model, double engineVolume, int bestLapTime, int maxSpeed, TypeOfBody typeOfBody) {
        super(brand, model, engineVolume);
        this.bestLapTime = Math.max(bestLapTime, 0);
        this.maxSpeed = Math.max(maxSpeed, 0);
        this.typeOfBody = typeOfBody;
    }

    public TypeOfBody getTypeOfBody() {
        return typeOfBody;
    }

    public void setTypeOfBody(TypeOfBody typeOfBody) {
        this.typeOfBody = typeOfBody;
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
        if (typeOfBody == null) {
            System.out.println("Данных по авто недостаточно");
        } else {
            System.out.println("Тип кузова авто: " + typeOfBody.getName());
        }
    }

    @Override
    public boolean service() {
        return Math.random()>0.8;
    }

    @Override
    public void repair() {
        System.out.println("Легковой автомобиль " + getBrand() + " " + getModel() +
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
        return "Легковой автомобиль: " + getBrand() +
                " " + getModel() +
                "; объем двигателя: " + getEngineVolume();
    }
}