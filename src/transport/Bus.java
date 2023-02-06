package transport;

import Drivers.DriverD;
import Enums.SeatsAmount;
import Enums.VehicleType;
import Interfaces.Competing;
import Exception.TransportTypeException;
import Service.Mechanic;

import java.util.List;

public class Bus extends Transport<DriverD> implements Competing {
    private SeatsAmount seatsAmount;
    private VehicleType vehicleType;
    public Bus (String brand, String model, double engineVolume, DriverD driver, SeatsAmount seatsAmount, VehicleType vehicleType, List<Mechanic> mechanicList) {
        super(brand, model, engineVolume, driver, mechanicList);
        this.seatsAmount = seatsAmount;
        this.vehicleType = vehicleType;
    }

    public SeatsAmount getSeatsAmount() {
        return seatsAmount;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void start() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " начинает движение");
    }

    public void stop() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " заканчивает движение");
    }


    public void pitStop() {
        System.out.println("Пит-стоп для автобуса");
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

    @Override
    public void diagnose() throws TransportTypeException {
        throw new TransportTypeException("Автобусы не проходят диагностику");
    }

}
