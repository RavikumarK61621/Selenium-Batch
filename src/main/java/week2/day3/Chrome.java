package week2.day3;

public class Chrome extends Browser{

	public void openIncognito() {
		System.out.println("Open the openIncognito");
	}

	public void clearCache() {
		System.out.println("clearCache for the browser");
	}
	
	public static void main(String[] args) {
		Chrome c= new Chrome();
		c.openURL();
		c.closeBrowser();
		c.navigateBack();
		c.clearCache();
		c.openIncognito();
		
		
	}
	
	
}

