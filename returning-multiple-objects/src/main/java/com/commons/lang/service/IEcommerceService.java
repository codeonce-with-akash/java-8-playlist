package com.commons.lang.service;

import org.apache.commons.lang3.tuple.Pair;
import org.apache.commons.lang3.tuple.Triple;

import com.commons.lang.model.OrderDetails;
import com.commons.lang.model.PaymentDetails;
import com.commons.lang.model.ShipmentDetails;

public interface IEcommerceService {
	Pair<OrderDetails, ShipmentDetails> getOrderAndShipmentDetailsByOrderId(Long orderId);
	
	Triple<OrderDetails, ShipmentDetails, PaymentDetails> getOrderShipmentAndPaymentDetailsByOrderId(Long orderId);
	
}
