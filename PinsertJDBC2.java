//insert Data with Dynamic Input PreparedStatement
import java.sql.*;
import java.io.*;
class PinsertJDBC2
{
	public static void main(String[]args)
	{
		try
		{
			//loading the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			//
			String url="jdbc:mysql://localhost:3306/mydb";
			String username="root";
			String password="051242";


			//creating connection
			Connection con=DriverManager.getConnection(url,username,password);

			//query
			String q="insert into table1(tName,tCity) values (?,?)";

			//get PreparedStatement object
			PreparedStatement pstmt=con.prepareStatement(q);

			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

			System.out.println("enter name:  ");
			String name=br.readLine();

			System.out.println("enter city: ");
			String city=br.readLine();


			pstmt.setString(1,name);
			pstmt.setString(2,city);


			pstmt.executeUpdate();

			System.out.println("Value inserted....");




		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}