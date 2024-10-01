package vn.tiger.sagacommon.commands;

import org.axonframework.modelling.command.TargetAggregateIdentifier;

import lombok.Builder;
import lombok.Data;
import vn.tiger.sagacommon.model.CardDetails;

@Data
@Builder
public class ValidatePaymentCommand {
    @TargetAggregateIdentifier
    private String paymentId;

    private String orderId;
    private CardDetails cardDetails;
}
