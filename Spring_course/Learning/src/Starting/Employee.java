package Starting;

import java.util.Scanner;

public class Employee {
	Scanner s = new Scanner(System.in); 
	
	String name;
	
	
	public Employee(String name) {
		this.name = name;
	}

	public void handleCustomer(Customer cust, Boolean finance, Vehicle vehicle) {

		if (finance) {
			double amount = vehicle.cost - cust.cashOnHand;
			runCreditHistory(cust, amount,vehicle);
		} else if (vehicle.cost <= cust.cashOnHand) {
			processTransaction(cust, vehicle);
		}
		else {
			System.out.println("Not sufficient Balance");
		}
	}
	
	public void runCreditHistory(Customer customer , Double amount,Vehicle vehicle) {
		if(customer.billpaid) {
			System.out.println("you are eligible for finanace of "+amount);
			processTransaction(customer,vehicle);
		}else {
			System.out.println(customer.name +" is not eligible for finanace");
		}
	}
	
	public void processTransaction(Customer customer,Vehicle vehicle) {
		System.out.println("Congratulation!! on new  Honda ");
		System.out.println("Thank You! for choosing Dealership");
	}
}
