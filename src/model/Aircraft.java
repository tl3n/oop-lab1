package model;

public abstract class Aircraft {
    private String model;
    private double range;
    private double fuelConsumption;

    public Aircraft(String model, double range, double fuelConsumption) {
        this.model = model;
        this.range = range;
        this.fuelConsumption = fuelConsumption;
    }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public double getRange() { return range; }
    public void setRange(double range) { this.range = range; }

    public double getFuelConsumption() { return fuelConsumption; }
    public void setFuelConsumption(double fuelConsumption) { this.fuelConsumption = fuelConsumption; }

    public abstract int getPassengerCapacity();
    //public abstract void setPassengerCapacity(int passengerCapacity);

    public abstract double getCargoCapacity();
    // public abstract void setCargoCapacity(double cargoCapacity);
}
