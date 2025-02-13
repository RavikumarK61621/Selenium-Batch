package week3.day1;

public class JavaConnection extends MySqlConnection{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		JavaConnection JC = new JavaConnection();
			JC.connect();
			JC.disconnect();
			JC.executeUpdate();
			JC.executeQuery();
			
		}

		@Override
		void executeQuery() {
			System.out.println("abstract method");
			// TODO Auto-generated method stub
			
		}
	}

