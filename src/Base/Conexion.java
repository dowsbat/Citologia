/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Oscar Rivera
 */
public class Conexion {
    
    private Connection conexion;
    private Statement sentencia;
    
    //Datos para la conexion con la DB
    private final String servidor = "localhost";
    private final String puerto =  "3306";
    private final String DB = "Citologia";
    private final String usuario = "root";
    private final String clave = "";
    private final String URL = "jdbc:mysql://"+ servidor +":"+puerto+"/"+DB;

/**    
 *Metodo Constructor, que inicializa los atributos
 *internos del conector de DB
 */    
    public Conexion (){
        this.conexion= null;
        this.sentencia=null;
        
    }
    
    /**
     * Metodo para crear la comunicacion con la DB
     * @return true cuando la conexion se crea correctamente
     * y false cuando no es posible
     */
    
    public boolean conectar() {
        boolean estado = false;
        try {
            //Levantar la conexion con la base
            Class.forName("com.mysql.jdbc.Driver");
            try {
                //Establecer la conexion ocn la DB
                conexion = DriverManager.getConnection(URL, usuario, clave);
                estado = true;
            } catch (SQLException ex) {
                System.err.print("ERROR: ConectorDB.Conectar()");
                System.err.println("Al Intentar la Conexion con la DB");
                System.err.println(ex.getMessage());
            }
        } catch (ClassNotFoundException cex) {
            System.err.print("ERROR: ConectorDB.Conectar()");
            System.err.println("Al Intentar la Conexion con la DB");
            System.err.println(cex.getMessage());
        }
        return estado;
    }
    
    public ResultSet Seleccionar (String sql) {
        ResultSet resultado = null;
        try {
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sql);
        } catch (SQLException sqle) {
            System.err.println("ERROR: ConectorDB.Seleccionar(sql)");
            System.err.println(sqle.getMessage());
        }
        
        return resultado;
    }
    
    /**
     * Para Ejecutar sentecias SQL: INSERT , UPDATE, DELETE
     * @param sql texto con el script sql para ejecutar sobre la DB
     * @return true si la sentencia tiene exito y
     * false en caso de no
     */
    public boolean ejecutar (String sql){
        boolean estado = false;
        try {
            sentencia = conexion.createStatement();
            sentencia.execute(sql);
            sentencia.close();
            estado= true;
        } catch (SQLException sqle) {
            System.err.println("ERROR: ConectorDB.Ejecutar(sql)");
            System.err.println(sqle.getMessage());
        }
        return estado;
    }
    
    /**
     * Para cerrar la conexion de forma correcta con la base de datos,
     * verificando que exista la conexion
     */
    public void desconectar(){
    
        try {
            if (conexion != null) {
                conexion.close();
                conexion=null;
            }
        } catch (SQLException sqle) {
            System.err.println("ERROR: ConectorDB.desconectar(sql)");
            System.err.println(sqle.getMessage());
        }
    
    }
    
    /**
     * Retorna la conexion actual que este establecida
     * @return conexion
     */
    public Connection getConexion(){
        return conexion;
    } 
    
}
