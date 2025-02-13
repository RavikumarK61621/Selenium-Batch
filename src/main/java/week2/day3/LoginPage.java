package week2.day3;

public class LoginPage extends BasePage{
	
	public void performCommonTasks() {
		System.out.println("overridden the Method from the BasePage class");
	}
	
	public static void main(String[] args) {
		LoginPage LP = new LoginPage();
		LP.findElement("uName");
		LP.clickElement("uName");
		LP.enterText("uName", "pWord");
		LP.performCommonTasks();
		
	}
}

	