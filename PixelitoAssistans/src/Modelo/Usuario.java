package Modelo;

import java.util.List;
import java.util.ArrayList;

public class Usuario {

    static int generador;
    static String ident = "USER";
    private String id;
    
    private String nombre;
    private String apellidos;
    private int dni;
    private String correo;
    private String contraseña;
    private int idPeriodo;
    private int idCurso;
    private int idCarrera;

    private List listaNotas = new ArrayList();
    private double promedio;
    private String rendimiento;

    private String error = "";

    public String getError() {
        return error;
    }

    public Usuario() {
    }

    public Usuario(String nombre, String apellidos, int dni, String correo, String contraseña, int idPeriodo, int idCurso, int idCarrera) {
        this.id = Usuario.generatorId(nombre, correo);
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.correo = correo;
        this.contraseña = contraseña;
        this.idPeriodo = idPeriodo;
        this.idCurso = idCurso;
        this.idCarrera = idCarrera;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String nombre, String correo) {
        this.id = Usuario.generatorId(nombre, correo);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidos = apellidoPaterno;
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

    //////////////////////////////
    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public String getRendimiento() {
        return rendimiento;
    }

    public void setListaNotas(List<String> listaNotas) {
        this.listaNotas = listaNotas;
    }

    public List getListaNotas() {
        return listaNotas;
    }

    public void listarNotas(String notas) {
        this.listaNotas.add(notas);
    }
    
    //Generador id
    public static String generatorId(String nombre, String correo) {
        String res;
        
        if (nombre == null || nombre.length() == 0) {
            return null;
        } else {
            char[] charArrNombre = nombre.toCharArray();
            char[] charArrCorreo = correo.toCharArray();
            res = charArrCorreo[0]+""+charArrCorreo[1]+""+charArrNombre[0]+""+charArrNombre[1];
            return ident+generador+res.toUpperCase();
        }
    }

    public double MediaAritmentica() {
        double resultado = 0;
        double x;
        
        try {

            if (this.listaNotas != null) {
                for (int i = 0; i <= (listaNotas.size() - 1); i++) {

                    x = Double.parseDouble((String) listaNotas.get(i));
                    resultado += x;
                }
                promedio = resultado / this.listaNotas.size();
            }
        } catch (Exception e) {
            this.error = ""+e;

        }
        return this.promedio;
    }

    public void validarRendimiento() {
        if (this.promedio > 17 || this.promedio <= 20) {
            this.rendimiento = "Logro destacado";
        } else if (this.promedio < 18 || this.promedio > 14) {
            this.rendimiento = "Logro esperado";
        } else if (this.promedio < 15 || this.promedio > 12) {
            this.rendimiento = "Logro en proceso";
        } else if (this.promedio < 13) {
            this.rendimiento = "Logro en inicio";
        }
    }

    

}
