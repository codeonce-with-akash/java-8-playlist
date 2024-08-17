package com.commons.lang.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShipmentDetails {
	private Long shipmentId;
	private String shipmentType;
	private Long orderId;
}
