package com.seiryo.view;

import com.edu.service.TicketSerivce;

public class TicketView {
	public void view() {
		TicketSerivce ticketSerivce = new TicketSerivce();
		ticketSerivce.queryTicket();
		ticketSerivce.queryByNumber();
	}
}
