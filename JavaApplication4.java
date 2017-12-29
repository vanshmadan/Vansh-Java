/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;
import java.sql.*;
import java.util.*;
/**
 *
 * @author Vansh Madan
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
         public static void main(String ars[])
    {
    Connection c;
Statement s;
try
{
String sql,sno;
System.out.println("Enter serial number to delete records -- ");
Scanner in=new Scanner(System.in);
sno=in.nextLine();


sql="delete from staff5 where sno="+sno;
Class.forName("com.mysql.jdbc.Driver");
c=DriverManager.getConnection("jdbc:mysql://localhost:3306/vanshdata","root","vansh");
s=c.createStatement();
s.executeUpdate(sql);
System.out.print("record deleted");
s.close();
c.close();
}
catch(Exception e)
{
System.out.print(e);
    }
}
}
        
    
