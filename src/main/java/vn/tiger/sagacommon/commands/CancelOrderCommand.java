package vn.tiger.sagacommon.commands;

import org.axonframework.modelling.command.TargetAggregateIdentifier;

import lombok.Value;
import vn.tiger.sagacommon.constants.enums.OrderStatus;

@Value
public class CancelOrderCommand {

    @TargetAggregateIdentifier
    private String orderId;

    private String orderStatus = OrderStatus.CANCELLED.name();
}
