package org.example;
import java.sql.*;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static final String User="root";
    public static final String Pwd="XXXXX";
    public static final String Url="jdbc:mariadb://localhost:3336/classicmodels";



    public static void main(String[] args) {
        try{
            Connection conex=DriverManager.getConnection(Url, User, Pwd);
            System.out.println("Se ha conectado correctamente");

            String query= "SELECT customerName, phone from customers";

            PreparedStatement querySelect= conex.prepareStatement(query);

            ResultSet resultado= querySelect.executeQuery();


            while(resultado.next()){
                String nombre=resultado.getString("customerName");
                String tel=resultado.getString("phone");
                System.out.print("nombre: "+nombre+"\t");
                System.out.println("telefono: "+tel);
            }



            conex.close();


        }catch(SQLException e){
            System.out.println(e);
        }
    }
}