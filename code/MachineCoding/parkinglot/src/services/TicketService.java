package services;

import models.Gate;
import models.ParkingSpot;
import models.Ticket;
import models.Vehicle;
import repositories.TicketRepository;

import java.util.Date;

public class TicketService {
    private final TicketRepository ticketRepository = new TicketRepository();

    public Ticket createTicket(Vehicle vehicle, ParkingSpot spot, Gate gate) {

        Ticket ticket = Ticket
                .builder()
                .id(String.valueOf(Math.random()*100))
                .entryTime(new Date())
                .issuingGate(gate)
                .parkingAttendant(gate.getParkingAttendant())
                .vehicle(vehicle)
                .parkingSpot(spot)
                .build();

        ticketRepository.save(ticket);

        return ticket;
    }

}
