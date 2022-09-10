/*
ESTE ARCHIVO SOLO DEBE DE ESTAR UNA VEZ

Permite crear un objeto con los campos presentes en la base de datos
*/

package Especialista;

public class DatosEspecialista {
    
   private int id;
   private String nombre;
   private String apellidoPaterno;
   private String apellidoMaterno;
   private String profesion;
   private String cedula;
   private String especialidad;
   private String telefono;
   private String correo;
   private int status;
   
   public DatosEspecialista(){
       
   }
  // Se conecta a la tabla de especialistas

    public DatosEspecialista(int id, String nombre, String apellidoPaterno, String apellidoMaterno, String profesion, String cedula, String especialidad, String telefono, String correo, int status) {
        this.id = id;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.profesion = profesion;
        this.cedula = cedula;
        this.especialidad = especialidad;
        this.telefono = telefono;
        this.correo = correo;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
}
