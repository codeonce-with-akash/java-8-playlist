package com.commons.lang.dao;

import com.commons.lang.model.OrderDetails;
import com.commons.lang.model.PaymentDetails;
import com.commons.lang.model.ShipmentDetails;

public class EcommerceDaoImpl implements IEcommerceDao {

	@Override
	public OrderDetails getOrderDetails(Long orderId) {
		return new OrderDetails(101L, "MOBILE", 45000.00);
	}

	@Override
	public ShipmentDetails getShipmentDetails(Long orderId) {
		return new ShipmentDetails(201L, "AIR", orderId);
	}

	@Override
	public PaymentDetails getPaymentDetails(Long orderId, Double paymentAmount) {
		return new PaymentDetails(301L, "CARD-PAYMENT", paymentAmount, orderId);
	}

}
