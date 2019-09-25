
package taller2;

import dao.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class VendedorDAO {
    
    Conexion con;

    public VendedorDAO() {
        this.con = new Conexion();
    }
    
    public ArrayList<Vendedor> getVendedores(){
        
        ArrayList<Vendedor> vendedores = new ArrayList<>();
        Connection accesoBD = con.getConexion();

        try{
            String sql="SELECT * FROM persona ";
            
            //System.out.println(sql);
            Statement st = accesoBD.createStatement();
            ResultSet resultados = st.executeQuery(sql);
           
            
            while ( resultados.next() ) {
                String nombre = resultados.getString("nombre");
                String apellido = resultados.getString("apellido");
                String rut = resultados.getString("rut");
                int idVendedor = resultados.getInt(resultados.getInt("id"));
                vendedores.add(new Vendedor (idVendedor,nombre, apellido,rut));
            }
           // accesoBD.close();
            return vendedores;
        }catch (Exception e){
            System.out.println();
            System.out.println("Error al obtener");
            e.printStackTrace();
            return null;
        }       
    }
    
   public Vendedor getPersona(int id) {
        Vendedor p = new Vendedor();
        Connection accesoBD = con.getConexion();

        try {
            String sql = "SELECT * FROM persona WHERE id=" + id + ";";

            Statement st = accesoBD.createStatement(); //Objeto que viaja hasta la base de datos y lleva la consulta
            ResultSet resultados = st.executeQuery(sql); //Resultados enviados de vuelta

            //tambien se puede hacer con if y con resultados.first();
            while (resultados.next()) { //es una iterador propio de resultset que entrega un boleano y cambia a la siguiente tupla para obtener datos de todas las tuplas.
                String nombre = resultados.getString("nombre");
                String apellido = resultados.getString("apellido");
                String rut = resultados.getString("rut");
                int idVendedor = resultados.getInt("id");
                p = new Vendedor(idVendedor,nombre, apellido,rut);
            }
            return p;
        } catch (Exception e) {
            System.out.println();
            System.out.println("Error al obtener");
            e.printStackTrace();
            return null;
        }
    }


    public boolean insertarVendedor (Vendedor v){
        
        Connection accesoBD = con.getConexion();
        
        try{
            
            //INSERT INTO persona (nombre,apellido,edad) VALUES ( 'Pedro', 'Puentes', 18);
            
            String sql =    "INSERT INTO vendedor (nombre,apellido,rut)"
            + "VALUES ('"+v.getNombre()+"', '"+ v.getApellido()+" ' , " + v.getRut()+ ")"; 
            
            Statement st = accesoBD.createStatement();
            st.executeUpdate(sql); //executeUpdate para modificar la BD
            return true;
            
        }catch(Exception e){
            System.out.println("Error al insertar persona");
            e.printStackTrace();
            return false;
        }
       
    }
}


