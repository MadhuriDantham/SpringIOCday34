package ai.jobiak.ioc;

public class NewConnection {
	
	public NewConnection getConnection() {
		System.out.println("providing the connection");
		return  new NewConnection();

}
}
