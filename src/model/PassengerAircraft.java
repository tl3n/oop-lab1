package model;

public class PassengerAircraft extends Aircraft {
    private int passengerCapacity;

    public PassengerAircraft(String model, int passengerCapacity, double range, double fuelConsumption) {
        super(model, range, fuelConsumption);
        this.passengerCapacity = passengerCapacity;
    }

    // Getters and setters
    @Override
    public int getPassengerCapacity() { return passengerCapacity; }

    // @Override
    public void setPassengerCapacity(int passengerCapacity) { this.passengerCapacity = passengerCapacity; }

    // @Override
    public double getCargoCapacity() { return 0; }
}
