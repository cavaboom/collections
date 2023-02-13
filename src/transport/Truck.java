package transport;

import Drivers.DriverC;
import Enums.LoadCapacity;
import Enums.VehicleType;
import Interfaces.Competing;
import Service.Mechanic;

import java.util.List;

public class Truck extends Transport<DriverC> implements Competing {
    private LoadCapacity loadCapacity;
    private VehicleType vehicleType;

    public Truck (String brand, String model, double engineVolume, DriverC driver, LoadCapacity loadCapacity, VehicleType vehicleType, List<Mechanic> mechanicList) {
        super(brand, model, engineVolume, driver, mechanicList);
        this.loadCapacity = loadCapacity;
        this.vehicleType = vehicleType;
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void start() {
        System.out.println("Грузовой автомобиль " + getBrand() + " " + getModel() + " начинает движение");
    }

    public void stop() {
        System.out.println("Грузовой автомобиль " + getBrand() + " " + getModel() + " заканчивает движение");
    }

    @Override
    public void diagnose() {
        System.out.println("Провести диагностику грузовика");
    }

    public void pitStop() {
        System.out.println("Пит-стоп для грузовика");
    }

    public void bestLapTime() {
        System.out.println("Лучшее время круга " + getBrand() + " " + getModel());
    }

    public void maxSpeed() {
        System.out.println("Максимальная скорость " + getBrand() + " " + getModel());
    }

    public void printType() {
        if(vehicleType == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Тип транспортного средства " + vehicleType);
        }
    }

}
