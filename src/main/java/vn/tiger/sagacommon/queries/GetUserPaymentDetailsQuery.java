package vn.tiger.sagacommon.queries;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetUserPaymentDetailsQuery {
    private String userId;
}
