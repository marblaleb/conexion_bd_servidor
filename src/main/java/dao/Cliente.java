package dao;

public class Cliente {

    private Integer id;
    private String nombre;
    private String apellido;

    private String primerNombre;

    private  String telefono;



    private String direccion;

    private String ciudad;

    private String pais;

    public Cliente(Integer id, String nombre, String telefono){

        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;


    }




    public Cliente(Integer id, String nombre, String apellido, String primerNombre, String telefono, String direccion, String ciudad, String pais) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.primerNombre = primerNombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.pais = pais;
    }











    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public  void setApellido(String apellido) {
        apellido = apellido;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        primerNombre = primerNombre;
    }

    public  String getTelefono() {
        return telefono;
    }

    public  void setTelefono(String telefono) {
        telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public  void setDireccion(String direccion) {
        direccion = direccion;
    }

    public  String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        pais = pais;
    }





}
