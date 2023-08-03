package models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Ticket {
    private String id;
    private Date entryTime;
    private ParkingSpot parkingSpot;
    private Gate issuingGate;
    private ParkingAttendant parkingAttendant;
    private Vehicle vehicle;
}
