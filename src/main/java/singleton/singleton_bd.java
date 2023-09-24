package singleton;
import java.sql.*;
public class singleton_bd {

    private static String Url;
    private static String User;
    private static String Pwd;
    private static Connection conn = null;




    private singleton_bd() {

         User = "root";
         Pwd = "XXXXX";
         Url = "jdbc:mariadb://localhost:3336/classicmodels";

        try{
            Connection conex=DriverManager.getConnection(Url, User, Pwd);
            System.out.println("Se ha conectado correctamente");
        }catch(SQLException e){
            System.out.println(e);
        }



    }




    // Métodos
    public static Connection getConnection(){

        if (conn == null){
            User = "root";
            Pwd = "XXXXX";
            Url = "jdbc:mariadb://localhost:3336/classicmodels";

            try{
                conn=DriverManager.getConnection(Url, User, Pwd);
                System.out.println("Se ha conectado correctamente");
            }catch(SQLException e){
                System.out.println(e);
            }
        }

        return conn;
    } // Fin getConnection
}


