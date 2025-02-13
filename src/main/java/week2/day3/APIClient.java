package week2.day3;

public class APIClient {
	
	public void sendRequest(String endpoint) {
		System.out.println(endpoint);
	}
	
	public void sendRequest(String endpoint, String requestBody) {
		System.out.println(endpoint + requestBody);
	}

	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		System.out.println(endpoint + requestBody + requestStatus);
	}
	
	public static void main(String[] args) {
		APIClient APC = new APIClient();
		APC.sendRequest("endpoint");
		APC.sendRequest("endpoint" , " requestBody ");
		APC.sendRequest("endpoint" , " requestBody " , false);
	}
}

	