package models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class ParkingFloor {
    private int floorNumber;
    private List<ParkingSpot> parkingSpots;
    private double ceilingHeight;
}
