package controllers;

import dto.GenerateTicketRequest;
import dto.GenerateTicketResponse;
import exceptions.GateNotFoundException;
import exceptions.NoParkingSpotsAvailableException;
import models.Ticket;
import services.EntryGateService;

/**
 * Roles of a controller:
 * 1. To perform validations.
 * 2. Call the correct order of services with appropriate params
 * 3. Render the response object.
 */
public class TicketController {

    private EntryGateService entryGateService;

    public TicketController(EntryGateService entryGateService) {
        this.entryGateService = entryGateService;
    }

    public GenerateTicketResponse generateTicket(
            GenerateTicketRequest request) throws NoParkingSpotsAvailableException {

        // Validation checks
        if (request.getGate() == null) {
            throw new GateNotFoundException();
        }

        Ticket ticket = entryGateService.createTicket(request.getGate(), request.getVehicle());

        // Rendering the response
        return GenerateTicketResponse.builder().ticket(ticket).build();
    }
}
