package dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import models.Ticket;

@Setter
@Getter
@Builder
public class GenerateTicketResponse {
    private Ticket ticket;
}
