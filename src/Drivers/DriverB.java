package Drivers;
import Utilities.Utilities;
public class DriverB extends Driver{
    private String typeOfDrivingLicense;

    public DriverB(String fullName, boolean hasDriverLicense, double driveExp, String typeOfDrivingLicense) {
        super(fullName, hasDriverLicense, driveExp);
        this.typeOfDrivingLicense = Utilities.check(typeOfDrivingLicense);
    }

    public String getTypeOfDrivingLicense() {
        return typeOfDrivingLicense;
    }

    public void setTypeOfDrivingLicense(String typeOfDrivingLicense) {
        this.typeOfDrivingLicense = Utilities.check(typeOfDrivingLicense);
    }

    public void start() {
        System.out.println("Водитель с категорией B " + getFullName() + " начал движение");
    }

    public void stop() {
        System.out.println("Водитель с категорией B " + getFullName() + " остановился");
    }

    public void fillTheCar() {
        System.out.println("Водитель с категорией B " + getFullName() + " заправляет авто");
    }
}
