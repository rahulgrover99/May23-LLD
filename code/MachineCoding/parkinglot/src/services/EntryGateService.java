package services;

import exceptions.NoParkingSpotsAvailableException;
import models.Gate;
import models.ParkingSpot;
import models.Ticket;
import models.Vehicle;

public class EntryGateService {
    SlotAllocationService slotAllocationService = new SlotAllocationService();
    TicketService ticketService = new TicketService();


    public Ticket createTicket(Gate gate, Vehicle vehicle)
            throws NoParkingSpotsAvailableException {

        // Step 1: Find an available spot for the vehicle.
        ParkingSpot availableParkingSpot =
                slotAllocationService.findSpot(vehicle.getVehicleType());

        if (availableParkingSpot == null) {
            throw new NoParkingSpotsAvailableException();
        }

        Ticket ticket = ticketService.createTicket(vehicle, availableParkingSpot, gate);
        slotAllocationService.allocateSpot(availableParkingSpot);

        return ticket;
    }
}
