
public class Customer{

	int customerId;
	String name;
	String city;
	String phone;
	String email;

	public int getCustomerId(){
		return customerId;
	}
	public void setCustomerId(int customerId){
		this.customerId=customerId;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getCity(){
		return city;
	}
	public void setCity(String city){
		this.city=city;
	}
	public String getPhone(){
		return phone;
	}
	public void setPhone(String phone){
		this.phone=phone;
	}
	public String getEmail(){
		return email;
	}
	public void setEmail(String email){
		this.email=email;
	}

	Customer(){
		// System.out.println("*");
	}
	Customer(int customerId, String name, String city, String phone, String email){
		this.customerId=customerId;
		this.name=name;
		this.city=city;
		this.phone=phone;
		this.email=email;
	}
	boolean equals(Customer C1){
		if(C1.customerId==customerId && C1.name==name && C1.city==city && C1.phone==phone && C1.email==email) return true;
		return false;
	}


	public static void main(String args[]){
		
		Customer c1 = new Customer(1, "Vinod", "Bangalore", null, null);
		Customer c2 = new Customer(1, "Vinod", "Bangalore", null, null);
		
		c1.equals(c2);
		c2.equals(c1);
	}
}