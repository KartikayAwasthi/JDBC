//creating new table to insert image using jdbc
import java.sql.*;
class Itable
{
	public static void main(String[]args)
	{
		try
		{
			//loading the driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			//inputting String
			String url="jdbc:mysql://localhost:3306/mydb";
			String username="root";
			String password="051242";

			//creating connection
			Connection con=DriverManager.getConnection(url,username,password);

			//Query
			String q="create table images(id int primary key auto_increment,pic blob)";

			//creating statement
			Statement stmt=con.createStatement();
			stmt.executeUpdate(q);


			System.out.println("table created");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

