package dao;

import java.sql.*;

public class ClienteDao implements interface_dao {

    public static final String User = "root";
    public static final String Pwd = "XXXXX";
    public static final String Url = "jdbc:mariadb://localhost:3336/classicmodels";


    public ClienteDao() {
    }

    @Override
    public void insert(Cliente cliente) {


    }




    @Override
    public Cliente read(Integer id) {

        Connection conex = null;
        Cliente cliente = null;
        try {
            conex = DriverManager.getConnection(Url, User, Pwd);
            System.out.println("Se ha conectado correctamente");

            String query = "SELECT customerName, phone from customers where customerNumber=?";

            PreparedStatement querySelect = conex.prepareStatement(query);

            querySelect.setInt(1, id);



            ResultSet resultado = querySelect.executeQuery();




            while (resultado.next()) {


                cliente= new Cliente(id, resultado.getString("customerName"),  resultado.getString("phone") );


            }


            conex.close();


        } catch (SQLException e) {
            System.out.println(e);
        }

        return cliente;




    }

}
