/*  Write a main method in the Main class to test the application
 * 
Sample input and output
Enter no of bookings: 2
Enter the available tickets: 25
Enter the ticketid: 123
Enter the price: 100
Enter the no of tickets: 5
Available tickets: 25
Total amount:500
Available ticket after booking:20
Enter the ticketid: 124
Enter the price: 100
Enter the no of tickets: 2
Available tickets: 20
Total amount:200
Available ticket after booking:18
     */
package com.Evaluation2;
import java.util.Scanner;
public class EvQ3Main {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter no of bookings:");
		
		int bookings=scan.nextInt();
		
		System.out.println("Enter the available tickets:");
		
		int availabletickets=scan.nextInt();
		
      	EvQ3Ticket.setAvailableTickets(availabletickets);
    
		
		
		for(int i=0;i<bookings;i++)
		{
			
			System.out.println("Enter the  ticketsid:");
			int ticketid=scan.nextInt();
			
			System.out.println("Enter the  price:");
			int price=scan.nextInt();
			
			System.out.println("Enter no of tickets:");
			int noOfTickets=scan.nextInt();
			
			EvQ3Ticket obj=new EvQ3Ticket(ticketid,price);
			
			
			System.out.println("                                           ");
			
			System.out.println("Available tickets:"+EvQ3Ticket.getAvailableTickets());
			
			System.out.println("Total amount:"+obj.calculateTicketCost(noOfTickets));
			
			System.out.println("Available ticket after booking:"+EvQ3Ticket.getAvailableTickets());
			
			
			
		}
		   System.out.println("                                           ");
            System.out.println("Thanku for your booking.........");
	}

}