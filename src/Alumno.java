public class Alumno {
    private String nombre;
    private String correo;

    public Alumno(){//constructor vacio
        //vacio
    }
    public Alumno(String nombre){//constructor con parametros
        this.nombre=nombre;
    }

    public Alumno(String nombre, String correo){//constructor con 2 parametros
        this.nombre=nombre;
        this.correo=correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
