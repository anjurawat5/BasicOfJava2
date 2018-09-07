package interfaceAssignment;

public class details implements ShoppingApp{

	@Override
	public void userName() {
		System.out.println("User Info");		
	}

	@Override
	public void loginDetails() {
		System.out.println("Login information");		
	}

	@Override
	public void cart() {
		System.out.println("Cart information");		
	}

	@Override
	public void addressDetail() {
		System.out.println("Address information");		
	}

	@Override
	public void onlinePayment() {
		System.out.println("Online payment information");		
	}

	@Override
	public void complaint() {
		System.out.println("Any complains");		
	}
	
	


}
