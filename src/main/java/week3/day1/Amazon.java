package week3.day1;

public class Amazon extends CanaraBank{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amazon A = new Amazon();
		A.upiPayments();
		A.internetBanking();
		A.cashOnDelivery();
		A.upiPayments();
		A.recordPaymentDetails();
		A.Print();
	}

	@Override
	Void Print() {
		System.out.println("Print");
		return null;
	}	
}
