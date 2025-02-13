package week3.day1;

public abstract class MySqlConnection implements DatabseConnection  {
 
		@Override
		public void connect() {
			System.out.println("Connect the execution");	
		}

		@Override
		public void disconnect() {
			System.out.println("Disconnect the execution");	
		}

		@Override
		public void executeUpdate() {
			System.out.println("Update the execution");	
		}
		
		abstract void executeQuery();

	}

	
