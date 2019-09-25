/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller2;

import dao.Conexion;
import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author Casa
 */
public class VentaDAO {
    
    Conexion con;

    public VentaDAO() {
        this.con = new Conexion();
    }
     public boolean insertarVenta (Venta v){
        
        Connection accesoBD = con.getConexion();
        
        try{
            
            
            
            String sql =    "INSERT INTO persona (fecha,id,monto,sucursal)"
            + "VALUES ('"+v.getFecha()+"', '"+ v.getId()+" ' , " + v.getMonto()+ ",'"+v.getSucursal()+"')"; 
            
            Statement st = accesoBD.createStatement();
            st.executeUpdate(sql); //executeUpdate para modificar la BD
            return true;
            
        }catch(Exception e){
            System.out.println("Error al insertar venta");
            e.printStackTrace();
            return false;
        }
       
     }
}
