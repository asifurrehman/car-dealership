package car_dealership;

public class Dealership {

	public static void main(String[] args) {
		
		
		Customer cust1 = new Customer();
		cust1.setName("Tom");
		cust1.setAddress("123 Anything St.");
		cust1.setCashOnhand("12000");
		
		Vehicle vehicle = new Vehicle();
		Employee emp = new Employee();
		
		
		
		cust1.purchaseCar(vehicle, emp, false);
		
		
		
		

	}

}
