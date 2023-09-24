package dao;

public class main_dao {
    public static void main(String[] args) {


    ClienteDao cliente = new ClienteDao();



    // agregar nuevo producto


    // obtener el producto con ID = 100

    Cliente c1 = cliente.read(496);
        System.out.println("Nombre: "+c1.getNombre());
        System.out.println("Telefono: "+ c1.getTelefono());
    }
}