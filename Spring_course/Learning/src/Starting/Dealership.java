package Starting;

public class Dealership {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer cust1= new Customer("Rachit", "sagar", 500000,false);
		
		Vehicle vehicle = new Vehicle("Honda", "civic", 900000);
		
		Employee emp = new Employee("peter");
		
		cust1.purchaseCar(vehicle, emp, true);
		emp.handleCustomer(cust1, true, vehicle);

	}

}
