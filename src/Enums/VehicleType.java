package Enums;

public enum VehicleType {
    CAR("Легковой автомобиль"),
    BUS("Автобус"),
    TRUCK("Грузовой автомобиль");

    private String vehicleType;

    VehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleType() {
        return vehicleType;
    }
}
