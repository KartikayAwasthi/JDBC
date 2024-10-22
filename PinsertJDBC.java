//Prepared Statement is using for dynamic or parameterised query
import java.sql.*;
class PinsertJDBC
{
	public static void main(String[]args)
	{
		try
		{
			//loading the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			//String entering
			String url="jdbc:mysql://localhost:3306/mydb";
			String username="root";
			String password="051242";

			//creating connection
			Connection con=DriverManager.getConnection(url,username,password);

			//entering query
			String q="insert into table1(tName,tCity) values (?,?)";//Dyanmic Query and parameterised query

			//get the PreparedStatement Object
			PreparedStatement pstmt=con.prepareStatement(q);

			//setting the values to query
			pstmt.setString(1,"Shivam");
			pstmt.setString(2,"Shahjahanpur");

			pstmt.executeUpdate();

			System.out.println("inserted....");

			con.close();

		}
		catch(Exception e)
		{
		  e.printStackTrace();
		}
	}
}