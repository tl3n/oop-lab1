package model;

public class CargoAircraft extends Aircraft {
    private double cargoCapacity;

    public CargoAircraft(String model, double cargoCapacity, double range, double fuelConsumption) {
        super(model, range, fuelConsumption);
        this.cargoCapacity = cargoCapacity;
    }

    // Getters and setters
    @Override
    public double getCargoCapacity() { return cargoCapacity; }

    // @Override
    public void setCargoCapacity(double cargoCapacity) { this.cargoCapacity = cargoCapacity; }

    @Override
    public int getPassengerCapacity() { return 0; }
}
