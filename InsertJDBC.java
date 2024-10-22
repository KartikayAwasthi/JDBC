import java.sql.*;
class InsertJDBC
{
	public static void main(String[]args)
	{
		try
		{
			//loading Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//setting url username pssword
			String url="jdbc:mysql://localhost:3306/mydb";
			String username="root";
			String password="051242";
			//creating Connection
			Connection con=DriverManager.getConnection(url,username,password);

			//writing a query
			String q="create table table1(tId int(20) primary key auto_increment,tName varchar(200) not null,tCity varchar(200))";

			//creating statement 
			Statement stmt=con.createStatement();
			stmt.executeUpdate(q);

			System.out.println("table created in database");

			con.close();
		}
		catch(Exception e)
		{
		  e.printStackTrace();
		}
	}
}