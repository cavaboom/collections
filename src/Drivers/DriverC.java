package Drivers;

import Utilities.Utilities;

public class DriverC extends Driver{
    private String typeOfDrivingLicense;

    public DriverC(String fullName, boolean hasDriverLicense, double driveExp, String typeOfDrivingLicense) {
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
        System.out.println("Водитель с категорией C " + getFullName() + " начал движение");
    }

    public void stop() {
        System.out.println("Водитель с категорией C " + getFullName() + " остановился");
    }

    public void fillTheCar() {
        System.out.println("Водитель с категорией C " + getFullName() + " заправляет авто");
    }
}
