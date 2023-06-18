package Starting;

public class Customer {
	
	String name ;
	String add;
	double cashOnHand;
	boolean billpaid;
	
	
	
	public Customer(String name, String add, double cashOnHand,boolean billpaid) {
		
		this.name = name;
		this.add = add;
		this.cashOnHand = cashOnHand;
		this.billpaid = billpaid;
	}



	public void purchaseCar(Vehicle vehicle ,Employee emp, boolean finance) {
		
		System.out.println("Hello "+emp.name+", i want to but "+vehicle.Company+" "+vehicle.model);
				
	}

}
