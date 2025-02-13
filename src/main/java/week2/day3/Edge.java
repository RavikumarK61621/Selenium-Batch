package week2.day3;

public class Edge extends Browser {

	public void takeSnap() {
		System.out.println("TakeSnap of the screen");
	}
	
	public void clearCookies() {
		System.out.println("clearCookies from the browser");
	}


		public static void main(String[] args) {
				Edge e= new Edge();
					e.openURL();
					e.closeBrowser();
					e.navigateBack();
					e.takeSnap();
					e.clearCookies();
	
	
}
		}
