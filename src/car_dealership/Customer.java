package car_dealership;

public class Customer {
	
	
		private String name;
		private String address;
		private double cashOnhand;
	
	
	

		public String getName() {
			return name;
		}




		public void setName(String name) {
			this.name = name;
		}




		public String getAddress() {
			return address;
		}




		public void setAddress(String address) {
			
			address+=" Dealship City";
			this.address = address;
		}




		public double getCashOnhand() {
			return cashOnhand;
		}




		public void setCashOnhand(double cashOnhand) {
			
			cashOnhand+=500;
			this.cashOnhand = cashOnhand;
		}




		public void purchaseCar(Vehicle vehicle, Employee emp, boolean finance) {
					
			
			emp.handleCustomer(this, finance, vehicle);
				
		}
		
		
		
		
	
}
