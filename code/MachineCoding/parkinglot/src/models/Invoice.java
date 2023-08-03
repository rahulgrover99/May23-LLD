package models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Invoice {
    private int invoiceId;
    private Date exitTime;
    private Ticket ticket;
    private Payment payment;
    private Gate exitGate;
    private ParkingAttendant parkingAttendant;
}
