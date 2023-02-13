package transport;
import Service.Mechanic;
import Utilities.Utilities;
import Drivers.Driver;
import Exception.TransportTypeException;
import java.util.List;
public abstract class Transport<T extends Driver>{
    private String brand;
    private String model;
    private double engineVolume;
    private T driver;
    private List<Mechanic>mechanicList;

    public Transport(String brand, String model, double engineVolume, T driver, List<Mechanic>mechanicList) {
        this.brand = Utilities.check(brand);
        this.model = Utilities.check(model);
        this.engineVolume = Utilities.check(engineVolume);
        this.driver = driver;
        this.mechanicList = mechanicList;
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

    public T getDriver() {
        return driver;
    }

    public List<Mechanic> getMechanicList() {
        return mechanicList;
    }

    public void setBrand(String brand) {
        this.brand = Utilities.check(brand);
    }

    public void setModel(String model) {
        this.model = Utilities.check(model);
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = Utilities.check(engineVolume);
    }

    public abstract void printType();
    public void start() {
        System.out.println("Начать движение");
    }

    public void stop() {
        System.out.println("Закончить движение");
    }

    public abstract void diagnose() throws TransportTypeException;

    public void driverAndMechanic() {
        System.out.println(getBrand()+ " " + getModel() + " " + getDriver() + " " + getMechanicList());
    }

    @Override
    public String toString() {
        return brand + " " + model + " " + engineVolume;
    }
}
