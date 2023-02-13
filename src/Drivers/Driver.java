package Drivers;
import Utilities.Utilities;

import java.util.Objects;

public abstract class Driver {
    private String fullName;
    private boolean hasDriverlicense;
    private double driveExp;

    public Driver(String fullName, boolean hasDriverlicense, double driveExp) {
        this.fullName = Utilities.check(fullName);
        this.hasDriverlicense = hasDriverlicense;
        this.driveExp = Utilities.check(driveExp);
    }

    public String getFullName() {
        return fullName;
    }

    public boolean isHasDriverlicense() {
        return hasDriverlicense;
    }

    public double getDriveExp() {
        return driveExp;
    }


    public void setFullName(String fullName) {
        this.fullName = Utilities.check(fullName);
    }

    public void setHasDriverlicense(boolean hasDriverlicense) {
        this.hasDriverlicense = hasDriverlicense;
    }

    public void setDriveExp(double driveExp) {
        this.driveExp = Utilities.check(driveExp);
    }


    @Override
    public String toString() {
        return fullName;
    }
    public void start() {
        System.out.println("Начать движение");
    }

    public void stop() {
        System.out.println("Остановиться");
    }

    public void fillTheCar() {
        System.out.println("Заправить авто");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return hasDriverlicense == driver.hasDriverlicense && Double.compare(driver.driveExp, driveExp) == 0 && fullName.equals(driver.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, hasDriverlicense, driveExp);
    }
}
