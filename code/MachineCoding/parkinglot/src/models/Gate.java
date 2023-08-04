package models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Gate {
    int gateNumber;
    ParkingAttendant parkingAttendant;
    GateType gateType;
}
