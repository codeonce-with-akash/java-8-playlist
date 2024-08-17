package com.commons.lang.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetails {
	private Long orderId;
	private String orderName;
	private Double orderPrice;
}
