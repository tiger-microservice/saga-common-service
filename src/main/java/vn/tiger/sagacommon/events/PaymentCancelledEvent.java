package vn.tiger.sagacommon.events;

import lombok.Data;

@Data
public class PaymentCancelledEvent {
    private String paymentId;
    private String orderId;
    private String paymentStatus;
}
