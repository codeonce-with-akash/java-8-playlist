package com.commons.lang.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentDetails {
	private Long paymentId;
	private String paymentMode;
	private Double paymentAmount;
	private Long orderId;
}
