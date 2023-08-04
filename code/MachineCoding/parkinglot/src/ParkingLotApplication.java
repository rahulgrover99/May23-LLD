import controllers.TicketController;
import dto.GenerateTicketRequest;
import dto.GenerateTicketResponse;
import exceptions.NoParkingSpotsAvailableException;
import models.*;
import services.EntryGateService;

import java.util.List;
import java.util.Map;

public class ParkingLotApplication {
    public static void main(String[] args) {

        Vehicle vehicle = Vehicle.builder().vehicleType(VehicleType.CAR).regNumber("2322").build();
        Vehicle suv = Vehicle.builder().vehicleType(VehicleType.SUV).regNumber("2322").build();


        ParkingAttendant pa = ParkingAttendant.builder().email("abc@gmail.com").name("abc").build();
        Gate entryGate = Gate.builder()
                .gateNumber(1)
                .parkingAttendant(pa)
                .build();

        ParkingLot parkingLot = ParkingLot.builder()
                .entryGates(List.of(entryGate))
                .address("Some random address")
                .name("Random name")
                .build();

        EntryGateService entryGateService = new EntryGateService();

        TicketController controller = new TicketController(entryGateService);

        try {
            GenerateTicketResponse response = controller.generateTicket(
                    GenerateTicketRequest.builder().vehicle(suv).gate(entryGate).build());
            System.out.println(response.getTicket());
        } catch (NoParkingSpotsAvailableException e) {
            throw new RuntimeException(e);
        }


    }
}
