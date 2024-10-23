package com.jdbc.practice;

import com.mysql.cj.protocol.Resultset;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import static java.sql.Connection.*;

public class SelectJDBC
{
    public static void main(String[] args)
    {
        try
        {
            Connection con=ConnectionProvider.getConnection();
            String q="select * from table1";
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(q);

            while(rs.next())
            {
                int id=rs.getInt(1);
                String name=rs.getString(2);
                String city=rs.getString(3);
                System.out.println(id+" "+name+" "+city);

            }

            con.close();



        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
