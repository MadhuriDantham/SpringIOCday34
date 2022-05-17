package ai.jobiak.ioc2;
import ai.jobiak.ioc.*;

public class UseConnection {
	public UseConnection() {
	Connection con=new Connection();
	con.getConnection();
    System.out.println("connection is abtained"+this.getClass());
	

}
}