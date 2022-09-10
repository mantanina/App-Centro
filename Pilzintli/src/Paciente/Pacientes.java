/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paciente;



/**
 *
 * @author 1234
 */
public class Pacientes {
    private int id;
    private String nombre;
    private String apellido_paterno;
    private String apellido_materno;
    private String fecha_nacimiento;
    private String escolaridad;
    private String diagnostico;
    private int padre_id;
    private int status;

    public Pacientes() {
    }
    
    /*
Este metodo nos permite estar adentro de la 
tabla de pacientes en la base de datos 
*/
    
    public Pacientes(String nombre,String apellido_paterno,String apellido_materno,String fecha_nacimiento,String escolaridad, int padre_id, int status, int id){
        this.nombre = nombre;
        this.apellido_paterno = apellido_paterno;
        this.apellido_materno = apellido_materno;
        this.fecha_nacimiento =fecha_nacimiento;
        this.escolaridad = escolaridad;
        this.padre_id =padre_id;
        this.status = status;
        this.id = id;
     
    }    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    public String getApellido_materno() {
        return apellido_materno;
    }

    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }


    public String getEscolaridad() {
        return escolaridad;
    }

    public void setEscolaridad(String escolaridad) {
        this.escolaridad = escolaridad;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public int getPadre_id() {
        return padre_id;
    }

    public void setPadre_id(int padre_id) {
        this.padre_id = padre_id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
