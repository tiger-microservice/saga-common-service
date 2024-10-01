package vn.tiger.sagacommon.events;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OrderShippedEvent {
    private String shippingId;
    private String orderId;
    private String shipmentStatus;
}