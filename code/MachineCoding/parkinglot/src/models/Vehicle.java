package models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Vehicle {
    private String regNumber;
    private VehicleType vehicleType;
}
