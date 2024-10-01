import model.Aircraft;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Airline {
    private String name;
    private List<Aircraft> fleet;

    public Airline(String name) {
        this.name = name;
        this.fleet = new ArrayList<>();
    }

    public void addAircraft(Aircraft aircraft) {
        this.fleet.add(aircraft);
    }

    public int getTotalPassengerCapacity() {
        return fleet.stream().mapToInt(Aircraft::getPassengerCapacity).sum();
    }

    public double getTotalCargoCapacity() {
        return fleet.stream().mapToDouble(Aircraft::getCargoCapacity).sum();
    }

    public List<Aircraft> sortByRange() {
        return fleet.stream()
                .sorted(Comparator.comparingDouble(Aircraft::getRange))
                .collect(Collectors.toList());
    }

    public List<Aircraft> findAircraftByFuelConsumption(double min, double max) {
        return fleet.stream()
                .filter(a -> a.getFuelConsumption() >= min && a.getFuelConsumption() <= max)
                .collect(Collectors.toList());
    }

    public String getName() { return name; };
    public List<Aircraft> getFleet() { return new ArrayList<>(fleet); }
}
