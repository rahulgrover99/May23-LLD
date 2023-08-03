package models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ParkingSpot {
    private int spotNumber;
    private VehicleType supportedVehicleType;
    private SpotStatus spotStatus;
    private int floorNumber;
    private Vehicle vehicle;
}
