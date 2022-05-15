package Modelo;

public class Usuario {
    private String nombre;
    private String apellidoPaterno;
    private int dni;
    private String correo;
    private String contraseña;
    private int idPeriodo;
    private int idCurso;
    private int idCarrera;

    public Usuario() {
    }

    public Usuario(String nombre, String apellidoPaterno, int dni, String correo, String contraseña, int idPeriodo, int idCurso, int idCarrera) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.dni = dni;
        this.correo = correo;
        this.contraseña = contraseña;
        this.idPeriodo = idPeriodo;
        this.idCurso = idCurso;
        this.idCarrera = idCarrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(int idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public int getIdCarrera() {
        return idCarrera;
    }

    public void setIdCarrera(int idCarrera) {
        this.idCarrera = idCarrera;
    }
    
    
}
