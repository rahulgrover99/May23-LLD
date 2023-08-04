package models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@Builder
@ToString
public class Ticket {
    private String id;
    private Date entryTime;
    private ParkingSpot parkingSpot;
    private Gate issuingGate;
    private ParkingAttendant parkingAttendant;
    private Vehicle vehicle;
}
