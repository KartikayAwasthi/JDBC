import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Program for first jdbc program

class FirstJDBC
{
	public static void main(String[]args)
	{
		
		try
		{
			//loading the driver 
			Class.forName("com.mysql.cj.jdbc.Driver");

			//creating connection
			String url="jdbc:mysql://localhost:3306/mydb";
			String username="root";
			String password="051242";

			Connection con=DriverManager.getConnection(url,username,password);

			if(con.isClosed())
			{
				System.out.println("Connection closed");

			}
			else{
				System.out.println("cononection created");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}