package week3.day1;

public abstract class CanaraBank implements Payments{

	@Override
	public void cashOnDelivery() {
		System.out.println("Cash on delivery");
		
	}

	@Override
	public void upiPayments() {
		System.out.println("upi Payments");
		
	}
	
	public void recordPaymentDetails() {
		System.out.println("Record Payment Details");
	}
	
	abstract Void Print();
		
	
}
