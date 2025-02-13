package week2.day3;

public class MethodOverLoading {
	
		public void reportStep(String msg, String status) {
			System.out.println(msg+ " " +status);
		}
		public void reportStep(String msg, String status, boolean Yes) {
			System.out.println(msg+ " " +status+ " " +Yes);	}
		
		public static void main(String[] args) {
			MethodOverLoading m = new MethodOverLoading();
			m.reportStep("Status", "Pass");
			m.reportStep("Date is over", "Yes", false);
		

	}

}
