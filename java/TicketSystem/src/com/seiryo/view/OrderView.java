package com.seiryo.view;

import com.edu.service.OrderSerivce;

public class OrderView {
	public void view() {
		OrderSerivce orderSerivce = new OrderSerivce();
		orderSerivce.allOrderTicket();
	}
}
