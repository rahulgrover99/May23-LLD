package repositories;


import models.ParkingSpot;
import models.SpotStatus;
import models.VehicleType;

import java.util.ArrayList;
import java.util.List;

// Parking Spot repository interacts with Parking Spot Table in DB.
// IN this case we are actually using in-memory DB.
public class ParkingSpotRepository {

    List<ParkingSpot> parkingSpots = new ArrayList<>();

    public ParkingSpotRepository() {
        ParkingSpot car1 = ParkingSpot.builder()
                .spotNumber(1).floorNumber(1)
                .spotStatus(SpotStatus.AVAILABLE)
                .supportedVehicleType(VehicleType.CAR)
                .build();

        ParkingSpot car2 = ParkingSpot.builder()
                .spotNumber(2).floorNumber(2)
                .spotStatus(SpotStatus.AVAILABLE)
                .supportedVehicleType(VehicleType.CAR)
                .build();

        ParkingSpot bike1 = ParkingSpot.builder()
                .spotNumber(3).floorNumber(1)
                .spotStatus(SpotStatus.AVAILABLE)
                .supportedVehicleType(VehicleType.BIKE)
                .build();

        parkingSpots.addAll(List.of(car1, car2, bike1));
    }

    public void useParkingSpot(ParkingSpot parkingSpot) {
        if (!parkingSpots.contains(parkingSpot)) {
            throw new IllegalArgumentException("No such slot.");
        }

        parkingSpot.setSpotStatus(SpotStatus.BLOCKED);
    }

    public ParkingSpot findAvailableSlot(VehicleType type) {
        for (ParkingSpot parkingSpot: parkingSpots) {
            if (parkingSpot.getSpotStatus() == SpotStatus.AVAILABLE
             && parkingSpot.getSupportedVehicleType() == type) {
                return parkingSpot;
            }
        }
        return null;
    }
}
