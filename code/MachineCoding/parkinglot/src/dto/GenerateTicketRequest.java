package dto;

import lombok.Getter;
import lombok.Setter;
import models.Gate;
import models.Vehicle;

@Getter
@Setter
public class GenerateTicketRequest {
    private Vehicle vehicle;
    private Gate gate;
}
