package singleton;
import java.sql.*;
public class main_singleton {

    public static void main(String[] args) {



        try {
            Connection c = singleton_bd.getConnection();
            PreparedStatement st;
            st = c.prepareStatement("INSERT INTO customers(customerNumber, customerName, contactLastName, contactFirstName, phone, addressLine1, city, country) VALUES (?, ?,?, ?, ?, ?,?,?)");

            st.setInt(1, 10000);

            st.setString(2, "Indra");  //el 1 indica que se sustituira el primer '?' con el valor en int de 1234

            st.setString(3, "Prado");  //el 3 indica que se sustiruira el tercer '?' por la cadena "hola"
            //los tipos de variables deben coincidir con los tipos definidos en las columnas de la tabla en la que se insertaran

            st.setString(4, "Jose Luis");  //el 1 indica que se sustituira el primer '?' con el valor en int de 1234

            st.setString(5, "619121902");
            st.setString(6, "Calle Londres");
            st.setString(7, "Sevilla");
            st.setString(8, "Spain");


            if(st.executeUpdate()==1){
                System.out.println("fila insertada correctamente");
            }
        }
        catch (SQLException ex) {
            System.out.println(ex);
        }



    }
}
