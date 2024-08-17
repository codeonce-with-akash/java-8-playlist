package com.commons.lang.service;

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.MutablePair;
import org.apache.commons.lang3.tuple.MutableTriple;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.commons.lang3.tuple.Triple;

import com.commons.lang.dao.EcommerceDaoImpl;
import com.commons.lang.dao.IEcommerceDao;
import com.commons.lang.model.OrderDetails;
import com.commons.lang.model.PaymentDetails;
import com.commons.lang.model.ShipmentDetails;

public class EcommerceServiceImpl implements IEcommerceService {

	private IEcommerceDao dao = null;

	@Override
	public Pair<OrderDetails, ShipmentDetails> getOrderAndShipmentDetailsByOrderId(Long orderId) {
		dao = new EcommerceDaoImpl();
		OrderDetails orderDetails = dao.getOrderDetails(orderId);
		ShipmentDetails shipmentDetails = dao.getShipmentDetails(orderId);
		// return Pair.of(orderDetails, shipmentDetails); //can not modify the Pair
		return MutablePair.of(orderDetails, shipmentDetails); // can be modify the Pair
	}

	@Override
	public Triple<OrderDetails, ShipmentDetails, PaymentDetails> getOrderShipmentAndPaymentDetailsByOrderId(
			Long orderId) {
		dao = new EcommerceDaoImpl();
		OrderDetails orderDetails = dao.getOrderDetails(orderId);
		ShipmentDetails shipmentDetails = dao.getShipmentDetails(orderId);
		PaymentDetails paymentDetails = dao.getPaymentDetails(orderId, orderDetails.getOrderPrice());
		return Triple.of(orderDetails, shipmentDetails, paymentDetails);
	}

}
