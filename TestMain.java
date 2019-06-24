import java.util.*;

public class TestMain {
	
	public static void main(String[] args){
		
		BusTicket busobj = getTicketDetails();
	}
	
	public static BusTicket getTicketDetails(){
		
		BusTicket obj = new BusTicket();
		Person p = new Person();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the pasenger name:");
		obj.setPerson(p.setName(input.nextLine()));
		
		System.out.println("Gender:");
		obj.getPerson().setGender(input.next().charAt(0));
		
		System.out.println("Enter the Ticket no:");
		obj.setTicketNo(input.nextInt());
		
		System.out.println("Enter the Ticket Price: ");
		obj.setTicketPrice(input.nextFloat());
		
		return obj;
	}

}
