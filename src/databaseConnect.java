
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import javax.naming.*;
import javax.sql.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnpavelchak
 */
public class databaseConnect {

    String host = "jdbc:derby://localhost:1527/SchoolDB"; 
    String uName = "johnpavelchak";
    String uPass = "5rdx%RDX";
    
    
    public void createConnection(){
        
    
       try{
            
           Connection con = DriverManager.getConnection(host, uName, uPass );
            }
            catch(SQLException err){
                System.out.println(err.getMessage());
            } 
       
    }
}
