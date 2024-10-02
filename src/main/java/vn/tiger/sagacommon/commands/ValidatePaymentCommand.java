package vn.tiger.sagacommon.commands;

import lombok.Builder;
import lombok.Data;
import org.axonframework.modelling.command.TargetAggregateIdentifier;
import vn.tiger.sagacommon.model.CardDetails;

@Data
@Builder
public class ValidatePaymentCommand {
    @TargetAggregateIdentifier
    private String paymentId;

    private String orderId;
    private CardDetails cardDetails;
}
