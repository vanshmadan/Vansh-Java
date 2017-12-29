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
public class update_rec {
    public static void main(String args[])
    {
        Connection c;
        Statement s;
        try
        {
            String sql,sno,name,city,dept;
            int salary;
            
            System.out.print("Enter serialno to update record--");
            Scanner ob=new Scanner(System.in);
            sno=ob.nextLine();
            
            System.out.print("Enter new name-");
           
            name=ob.nextLine();
        
            System.out.print("Enter new city");
        
            city=ob.nextLine();
            
            System.out.print("Enter new dept");
           
            dept=ob.nextLine();
        
            System.out.print("Enter new salary");
        
            salary=ob.nextInt();
            
            sql="update staff5 set name='"+name+"', city='"+city+"', dept='"+dept"' salary="+salary+" where sno="+sno;
            
            
           
            Class.forName("com.mysql.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/vanshdata","root","vansh");
            
            s=c.createStatement();
            s.executeUpdate(sql);
            System.out.print("record updated");
            s.close();
            c.close();
        }
            catch(Exception e)
                    {
                    System.out.print(e);
                    }
            


        }
        
    }
    
}
