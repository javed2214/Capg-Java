
import java.util.*;

public class Ticket {
	
	private static int ticketid;
	private static int price;
	private static int availableTickets;
	
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

	public void setAvailableTickets(int availableTickets) {
		Ticket.availableTickets = availableTickets;
	}

	public int calculateTicketCost(int nooftickets){
		if(availableTickets > 0){
			availableTickets-=nooftickets;
			int tot = nooftickets * price;
			return tot;
		}
		return -1;
	}

	public static void main(String args[]){
		
		Ticket obj = new Ticket();
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter no bookings:");
		int book = kb.nextInt();
		
		System.out.println("Enter available tickets:");
		int c = kb.nextInt();
		obj.setAvailableTickets(c);
		
		while(book!=0){
			
			System.out.println("Enter the ticketid:");
			obj.setTicketid(kb.nextInt());
			
			System.out.println("Enter the price:");
			obj.setPrice(kb.nextInt());
			
			System.out.println("Enter No of Tickets:");
			int nooftickets = kb.nextInt();
			
			int x = obj.calculateTicketCost(nooftickets);
			
			System.out.println("Available Tickets: "+c);
			System.out.println("Total Amount: "+x);
			System.out.println("Available Tickets: "+obj.availableTickets);
			
			book-=1;
		}
		
		
	}
}
