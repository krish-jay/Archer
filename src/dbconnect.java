/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Krish Jay
 */
import java.sql.*;
public class dbconnect {
    Connection con;
    public Connection connect()
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");
            return con;
        }
        catch(Exception e){
            System.out.print(e);
            return null;
        }
    }
}
