/* Create a class Ticket with the following variables
int ticketid;
int price;
static int availableTickets;
Write the following method in the Ticket class:
public int calculateTicketCost(int noOfTickets) —this method should check the ticket
availability, If the tickets are available, reduce the noOfTickets from availableTickets and
calculate the total amount as noOfTickets*price and return the total amount. If the
tickets are not available, this method should return -1.

Write a main method in the Main class to test the application

  */

package com.Evaluation2;

public class EvQ3Ticket {
	
	private int ticketid;
	private int price;
    private static int availableTickets;
	
    public EvQ3Ticket() {
    	
    }
	

	public EvQ3Ticket(int ticketid, int price) {
		super();
		this.ticketid = ticketid;
		this.price = price;
		
	}




	public int getTicketid() {
		return ticketid;
	}




	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}




	public int getPrice() {
		return price;
	}




	public void setPrice(int price) {
		this.price = price;
	}




	public static int getAvailableTickets() {
		return availableTickets;
	}




	public static void setAvailableTickets(int availableTickets) {
		     EvQ3Ticket.availableTickets = availableTickets;
	}




	public  int calculateTicketCost(int noOfTickets) {
		
		if(noOfTickets<=availableTickets) {
			
			int totalAmunt=noOfTickets*price;
			 availableTickets=availableTickets-noOfTickets;
			 
			 return totalAmunt;
			
		}
		else
		{
			return -1;
		}
		
		
	}

}
