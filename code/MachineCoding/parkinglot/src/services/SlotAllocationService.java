package services;

import models.ParkingSpot;
import models.VehicleType;
import repositories.ParkingSpotRepository;

public class SlotAllocationService {
    private ParkingSpotRepository parkingSpotRepository = new ParkingSpotRepository();

    public ParkingSpot findSpot(VehicleType vehicleType) {
        return parkingSpotRepository.findAvailableSlot(vehicleType);
    }

    public void allocateSpot(ParkingSpot parkingSpot) {
        parkingSpotRepository.useParkingSpot(parkingSpot);
    }
}
