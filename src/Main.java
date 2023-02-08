import Enums.BodyType;
import Enums.LoadCapacity;
import Enums.SeatsAmount;
import Enums.VehicleType;
import Service.Mechanic;
import Service.ServiceStation;
import transport.Car;
import transport.Bus;
import transport.Transport;
import transport.Truck;
import Drivers.DriverB;
import Drivers.DriverC;
import Drivers.DriverD;
import Exception.TransportTypeException;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        DriverB driverB = new DriverB("Иванов Сергей Сергеевич", true, 20, "B");
        DriverC driverC = new DriverC("Рогов Константин Алексеевич", true, 15, "C");
        DriverD driverD = new DriverD("Васильев Николай Александрович", true, 15, "D");

        Mechanic mechanic1 = new Mechanic("Константин", "Company1");
        Mechanic mechanic2 = new Mechanic("Владислав", "Company2");
        Mechanic mechanic3 = new Mechanic("Алексей", "Company3");
        Mechanic mechanic4 = new Mechanic("Михаил", "Company4");
        Mechanic mechanic5 = new Mechanic("Николай", "Company5");


        Car car1 = new Car("BMW", "Z8", 3.0, driverB, BodyType.SEDAN, VehicleType.CAR, List.of(mechanic1));
        Car car2 = new Car("Kia", "Sportage", 2.4, driverB, BodyType.SUV, VehicleType.CAR, List.of(mechanic1));
        Car car3 = new Car("Hyundai", "Avante", 1.6, driverB, BodyType.SEDAN, VehicleType.CAR, List.of(mechanic2));
        Car car4 = new Car("Lexus", "LX570", 5.7, driverB, BodyType.SUV, VehicleType.CAR, List.of(mechanic2));

        Bus bus1 = new Bus("Toyota", "Hiace", 2.0, driverD, SeatsAmount.EXTRASMALL, VehicleType.BUS, List.of(mechanic2));
        Bus bus2 = new Bus("Hyundai", "County", 2.0, driverD, SeatsAmount.SMALL, VehicleType.BUS, List.of(mechanic3));
        Bus bus3 = new Bus("ГАЗ", "ГАЗель Next", 2.0, driverD, SeatsAmount.EXTRASMALL, VehicleType.BUS, List.of(mechanic3));
        Bus bus4 = new Bus("Ford", "Transit", 2.2, driverD, SeatsAmount.EXTRASMALL, VehicleType.BUS, List.of(mechanic3));

        Truck truck1 = new Truck("Toyota", "Dyna", 4.1, driverC, LoadCapacity.N2, VehicleType.TRUCK, List.of(mechanic4));
        Truck truck2 = new Truck("КамАЗ", "43118", 11.7, driverC, LoadCapacity.N3, VehicleType.TRUCK, List.of(mechanic4));
        Truck truck3 = new Truck("DAF", "95XF", 13.0, driverC, LoadCapacity.N3, VehicleType.TRUCK, List.of(mechanic5));
        Truck truck4 = new Truck("Isuzu", "Elf", 5.2, driverC, LoadCapacity.N2, VehicleType.TRUCK, List.of(mechanic5));


        System.out.println("Водитель " + driverB + " управляет автомобилем " + car1 + " и будет участвовать в заезде");
        System.out.println("Водитель " + driverC + " управляет автомобилем " + truck1 + " и будет участвовать в заезде");
        System.out.println("Водитель " + driverD + " управляет автомобилем " + bus1 + " и будет участвовать в заезде");

        driverB.fillTheCar();
        driverB.start();
        car4.start();
        car4.stop();
        System.out.println();
        car2.pitStop();
        truck1.bestLapTime();
        System.out.println();
        System.out.println(car3);
        System.out.println();

        car1.diagnose();
        truck1.diagnose();
        try {
            bus1.diagnose();
        } catch (TransportTypeException e) {
            System.err.println("Автобусам не нужна диагностика");
        }

        car1.driverAndMechanic();

        List<Mechanic> listofMechanics = new ArrayList<>();
        listofMechanics.add(mechanic1);
        listofMechanics.add(mechanic2);
        listofMechanics.add(mechanic3);
        listofMechanics.add(mechanic4);
        listofMechanics.add(mechanic5);
        System.out.println(listofMechanics);

        List<Transport> transport = new ArrayList<>();
        transport.add(car1);
        transport.add(car2);
        transport.add(truck1);
        transport.add(truck2);
        transport.add(bus1);
        transport.add(bus2);
        System.out.println(transport);

        System.out.println();

        Map<Transport, List<Mechanic>> transportAndMechanic = new HashMap<>();
        transportAndMechanic.put(car1, car1.getMechanicList());
        transportAndMechanic.put(bus1, bus1.getMechanicList());
        transportAndMechanic.put(car3, car3.getMechanicList());
        transportAndMechanic.put(truck2, truck2.getMechanicList());
        transportAndMechanic.put(truck3, truck3.getMechanicList());

        for(Map.Entry<Transport, List<Mechanic>> map: transportAndMechanic.entrySet()) {
            System.out.println(map);
        }
        System.out.println();


        try {
            mechanic1.doMaintenance(car1);
            mechanic1.doMaintenance(truck1);
            mechanic1.doMaintenance(bus1);
        } catch (TransportTypeException e) {
            System.err.println("Автобусам не нужна диагностика");
        }

        System.out.println();

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.addTransport(car1);
        serviceStation.addTransport(bus1);
        serviceStation.addTransport(truck1);
        serviceStation.addTransport(car3);
        serviceStation.doInspectionCar();
    }

}