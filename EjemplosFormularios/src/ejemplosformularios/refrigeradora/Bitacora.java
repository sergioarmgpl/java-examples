/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosformularios.refrigeradora;

/**
 *
 * @author sergio.mendez
 */
    
import java.sql.*;  

public class Bitacora {   
    public Connection con;
    
    public Bitacora(){
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            con=DriverManager.getConnection("jdbc:mysql://34.66.223.150:3306/midb","root","demo123");  
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }
    
    public void cerrar(){
        try{ 
            con.close();
        }catch(Exception e){ 
            System.out.println(e);
        }
    }
    
    
    public void grabar(String instruccion,String detalle){
        try{

           Statement stmt = con.createStatement();
           String sql = "INSERT INTO midb.bitacora (instruccion,detalle)"+
           "VALUES (\""+instruccion+"\",\""+detalle+"\");";
           stmt.executeUpdate(sql);
        }catch(Exception e){
           e.printStackTrace();
        }
    }
    
    public String obtener(){
        String datos="";
        try{ 

            Statement stmt=con.createStatement();  
            ResultSet rs=stmt.executeQuery("SELECT * FROM midb.bitacora;");  
            while(rs.next())  
                datos += rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"\n";
        }catch(Exception e){ 
            System.out.println(e);
        }
        return datos;
    }
}
    




