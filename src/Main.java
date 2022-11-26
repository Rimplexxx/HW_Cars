import driver.DriverB;
import driver.DriverC;
import driver.DriverD;
import mechanic.Mechanic;
import mechanic.MechanicTransportType;
import sponsor.Sponsor;
import transport.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car audiQ3 = new Car("Audi", "Q3 1.4 TFSI", 2.0, 5, 178, TypeOfBody.CROSSOVER);
        DriverB oleg = new DriverB("Олег Петрович", 4, audiQ3);
        Sponsor sber = new Sponsor("Сбер", 100_000, true);
        Mechanic artemTereshkov = new Mechanic("Артем Терешков", "Авто-фикс", MechanicTransportType.CAR);
        audiQ3.addDriver(oleg);
        audiQ3.addSponsor(sber);
        audiQ3.addMechanic(artemTereshkov);

        Truck volvoFH16 = new Truck("Volvo", "FH16", 16.0, 14, 100, Weight.N1);
        DriverC ivan = new DriverC("Иван Романович", 6, volvoFH16);
        Sponsor tinkoff = new Sponsor("Тинькофф", 250_000, true);
        Mechanic pavelVolya = new Mechanic("Павел Воля", "Камеди клаб", MechanicTransportType.TRUCK);
        volvoFH16.addDriver(ivan);
        volvoFH16.addSponsor(tinkoff);
        volvoFH16.addMechanic(pavelVolya);

        Bus daewooBC212MA = new Bus("Daewoo", "BC212MA", 1.7, 10, 130, Capacity.LARGE);
        DriverD semen = new DriverD("Семен Дмитриевич", 9, daewooBC212MA);
        Sponsor avito = new Sponsor("Авито", 300_000, false);
        Mechanic fedorPetrov = new Mechanic("Федор Петров", "Барс", MechanicTransportType.BUS);
        daewooBC212MA.addDriver(semen);
        daewooBC212MA.addSponsor(avito);
        daewooBC212MA.addMechanic(fedorPetrov);

        List<Transport> transports = List.of(audiQ3, volvoFH16, daewooBC212MA);

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.addCar(audiQ3);
        serviceStation.addTruck(volvoFH16);
        serviceStation.service();
        serviceStation.service();

        for (Transport transport : transports) {
            printInfo(transport);
        }
    }

    private static void printInfo(Transport transport) {
        System.out.println("Информация по автомобилю " + transport.getBrand() + " " + transport.getModel());
        System.out.println("Водитель: " + transport.getDrivers());
        System.out.println("Спонсор: " + transport.getSponsors());
        System.out.println("Механик: " + transport.getMechanics());
        System.out.println();
    }

    private static void service(Transport... transports) {
        for (Transport transport : transports) {
            serviceTransport(transport);
        }
    }

    private static void serviceTransport(Transport transport) {
        try {
            if (!transport.service()) {
                throw new RuntimeException("Автомобиль " + transport.getBrand() + " " + transport.getModel() + " не прошел диагностику");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}