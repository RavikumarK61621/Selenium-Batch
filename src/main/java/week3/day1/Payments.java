package week3.day1;

public interface Payments {

		public void cashOnDelivery();
		
		public void upiPayments();
		
		static void cardPayments() {
			System.out.println("Card payment");
		}
		
		default void internetBanking() {
			System.out.println("internet banking");
		}
		
}
