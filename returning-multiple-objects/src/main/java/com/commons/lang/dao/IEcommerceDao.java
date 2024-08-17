package com.commons.lang.dao;

import com.commons.lang.model.OrderDetails;
import com.commons.lang.model.PaymentDetails;
import com.commons.lang.model.ShipmentDetails;

public interface IEcommerceDao {
	OrderDetails getOrderDetails(Long orderId);
	ShipmentDetails getShipmentDetails(Long orderId);
	PaymentDetails getPaymentDetails(Long orderId, Double paymentAmount);
}
