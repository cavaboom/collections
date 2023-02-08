package Drivers;

import Utilities.Utilities;

public class DriverD extends Driver{
    private String typeOfDrivingLicense;

    public DriverD(String fullName, boolean hasDriverLicense, double driveExp, String typeOfDrivingLicense) {
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
        System.out.println("Водитель с категорией D " + getFullName() + " начал движение");
    }

    public void stop() {
        System.out.println("Водитель с категорией D " + getFullName() + " остановился");
    }

    public void fillTheCar() {
        System.out.println("Водитель с категорией D " + getFullName() + " заправляет авто");
    }
}
