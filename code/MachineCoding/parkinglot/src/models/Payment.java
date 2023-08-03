package models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class Payment {
    private String reference;
    private Double amount;
    private PaymentMode paymentMode;
    private PaymentStatus paymentStatus;
    private Date time;
    private Ticket ticket;
}
