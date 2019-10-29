package car_dealership;

public class Employee {

	public void handleCustomer(Customer cust, boolean finance, Vehicle vehicle) {
		
		
		if(finance == true) {
			
			double loanAmount = vehicle.getPrice()-cust.getCashOnhand();
			runCredittHistory(cust, loanAmount);
			
		} else if (vehicle.getPrice()<=cust.getCashOnhand()) {
			
			// Customer pays on Cash
			processTransaction(cust, vehicle);
			
			
		}
		else {
			
			System.out.println("Customer will need more money to purchase vehicle: "+ vehicle);
		}
		
		
	}
	
	public void runCreditHistrory(Customer cust, double loanAmount) {
		
		System.out.println("Ran Credit history for Customer");
		System.out.println("Customer has been approved to purchase the vehile");
		
		
	}
	
	public void processTransaction(Customer cust, Vehicle vehicle) {
		
		System.out.println("Customer has purchased the vehicle: " + vehicle + " for the price "+ vehicle.getPrice());
		
		
	}
	
	
}
