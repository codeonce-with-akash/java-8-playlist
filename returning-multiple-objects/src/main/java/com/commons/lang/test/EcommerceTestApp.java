package com.commons.lang.test;

import org.apache.commons.lang3.tuple.Pair;
import org.apache.commons.lang3.tuple.Triple;

import com.commons.lang.model.OrderDetails;
import com.commons.lang.model.PaymentDetails;
import com.commons.lang.model.ShipmentDetails;
import com.commons.lang.service.EcommerceServiceImpl;
import com.commons.lang.service.IEcommerceService;

public class EcommerceTestApp {

	public static void main(String[] args) {
		IEcommerceService ecommerceService = new EcommerceServiceImpl();
		
		//1. GET ORDER AND SHIPMENTDETAILS BY ORDERID
		Pair<OrderDetails, ShipmentDetails> pair = ecommerceService.getOrderAndShipmentDetailsByOrderId(101L);
		//pair.setValue(new ShipmentDetails());
		OrderDetails orderDetails = pair.getLeft();
		ShipmentDetails shipmentDetails = pair.getRight();
		System.out.println("Order Details: "+orderDetails);
		System.out.println("Shipment Details: "+shipmentDetails);
		
		System.out.println("-------------------------------------------------------------");
		
		//2. GET ORDER, SHIPMENT AND PAYMENT DETAILS BY ORDERID
		Triple<OrderDetails,ShipmentDetails,PaymentDetails> triple = ecommerceService.getOrderShipmentAndPaymentDetailsByOrderId(101L);
		System.out.println(triple.getLeft());
		System.out.println(triple.getMiddle());
		System.out.println(triple.getRight());
	}

}
