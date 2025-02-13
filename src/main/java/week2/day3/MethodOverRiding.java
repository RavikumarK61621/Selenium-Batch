package week2.day3;

public class MethodOverRiding extends MethodOverLoading{

		public void reportStep(String msg, String status) {
			System.out.println(msg+ " " +status);

		}
			public static void main(String[] args) {
				MethodOverRiding snap = new MethodOverRiding();
				snap.reportStep("Message got Overrider", "True");
			}
	}

