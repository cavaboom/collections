package Drivers;

import Utilities.Utilities;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DriverC driverC = (DriverC) o;
        return typeOfDrivingLicense.equals(driverC.typeOfDrivingLicense);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfDrivingLicense);
    }
}
