package week2.day3;

public class MainMethodInheritance extends LoginTestData {

		public static void main(String[] args) {
			TestData TD = new TestData();
				TD.enterCredentials("uName", "pWord");
				TD.navigateToHomePage();
				
			LoginTestData LTD = new LoginTestData();
				LTD.enterUsername("User123");
				LTD.enterPassword("Password123");
	}
		
}
