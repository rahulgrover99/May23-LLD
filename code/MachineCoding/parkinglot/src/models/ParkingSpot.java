package models;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Builder
public class ParkingSpot {
    private int spotNumber;
    private VehicleType supportedVehicleType;
    private SpotStatus spotStatus;
    private int floorNumber;
    private Vehicle vehicle;
}
