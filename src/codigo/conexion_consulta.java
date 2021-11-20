package codigo;
import java.sql.*;

public class conexion_consulta {
    static Connection conexion=null;
    static Statement sentencia;
    static ResultSet resultado;
    public static void conectar(){
        String ruta="jdbc:mysql://localhost/prueba22";
        String user="root";
        String pass="";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion=DriverManager.getConnection(ruta,user,pass); 
            sentencia= conexion.createStatement();
            System.out.println("Conectado");
        } catch (Exception e) {
            System.out.println("No conectado");
        }
    }
    
     public static void guardar(variables x){
        String q = "INSERT INTO Datos VALUES('"+x.getNombre()+"','"+x.getApellido()+"','"+x.getID()+"','"+x.getSexo()+"','"+x.getDireccion()+"','"+x.getLugar()+"','"+x.getMotivo()+"','"+x.getMedico()+"','"+x.getFecha()+"')";
        ejecutar(q);
    }
     
     public static void ejecutar(String q){
        try {
            sentencia.executeUpdate(q);
            System.out.println("Correcto");
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public static variables buscar_reg(String Nombre){
        variables r = null;
        String q = "SELECT * FROM Datos" + " WHERE Nombre='"+Nombre+"'";
        try {
            resultado = sentencia.executeQuery(q);
            System.out.println("Correcto");
        } catch (Exception e) {
            System.out.println(" No Correcto");
        }
        r= asignar();
        return r;
                
    }
    public static variables asignar(){
      variables r = null;
      String Nombre;
      String Apellido;
      String ID;
      String Sexo;
      String Direccion;
      String Lugar;
      String Motivo;
      String Medico;
      String Fecha;
        try {
            if(resultado.last()){
                Nombre= resultado.getString("Nombre");
                Apellido= resultado.getString("Apellido");
                ID= resultado.getString("ID");
                Sexo= resultado.getString("Sexo");
                Direccion= resultado.getString("Direccion");
                Lugar= resultado.getString("Lugar");
                Motivo= resultado.getString("Motivo");
                Medico= resultado.getString("Medico");
                Fecha= resultado.getString("Fecha");
                
                r= new variables (Nombre, Apellido,ID,Sexo,Direccion,Lugar,Motivo,Medico,Fecha);
            }
        } catch (Exception e) {
        }
      
      return r;
                
    }
}