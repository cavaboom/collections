package Drivers;
import Utilities.Utilities;

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
}
