package week2.day3;

	public class BasePage {
	
	public void findElement(String elementName) {
		System.out.println(elementName);
	}
	public void clickElement(String elementName) {
		System.out.println(elementName);
	}
	public void enterText(String elementName, String text) {
		System.out.println(elementName + text);
	}
	public void performCommonTasks() {
		System.out.println("performCommonTasks");
	}

}

