//saving image in database using jdbc
import java.sql.*;
import java.io.*;
class ImageSave
{
	public static void main(String[]args)
	{
		try{

			//loading driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			//input url username and password
			String url="jdbc:mysql://localhost:3306/mydb";
			String username="root";
			String password="051242";
			//creating connection
			Connection con=DriverManager.getConnection(url,username,password);

			//query
			String q="insert into images(pic) values(?)";


			//using prepared statement bcz of dynamic query
			PreparedStatement pstmt=con.prepareStatement(q);


			//using filestream bcz of taking file as an input
			FileInputStream fis=new FileInputStream("goludada.jpg");

					
            //setting file
			pstmt.setBinaryStream(1,fis,fis.available());

			pstmt.executeUpdate();

			System.out.println("image saved successfully");

		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("error!!! ");
		}
	}
}