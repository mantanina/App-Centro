/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paciente;

/**
 *
 * @author edgar
 */
public class DatosPadreoTutor {
    private String nombretutor;
    private String apellidopaterno;
    private String apellidomaterno;
    private String direccion;
    private String codigopostal;
    private String municipio;
    private String estado;
    private int idtutor;

    public DatosPadreoTutor() {
    }
    /*
   Este metodo nos permite estar en la tabla de Tutores
   y nos mostrara lo que tiene en la base de datos
*/
    
    
    public DatosPadreoTutor(String nombretutor,String apellidopaterno,String apellidomaterno,String direccion,String codigopostal, String municipio, String estado,int idtutor){
        this.nombretutor = nombretutor;
        this.apellidopaterno = apellidopaterno;
        this.apellidomaterno = apellidomaterno;
        this.direccion = direccion;
        this.codigopostal = codigopostal;
        this.municipio = municipio;
        this.estado = estado;
        this.idtutor =idtutor;
     
    }

    public String getNombretutor() {
        return nombretutor;
    }

    public void setNombretutor(String nombretutor) {
        this.nombretutor = nombretutor;
    }

    public String getApellidopaterno() {
        return apellidopaterno;
    }

    public void setApellidopaterno(String apellidopaterno) {
        this.apellidopaterno = apellidopaterno;
    }

    public String getApellidomaterno() {
        return apellidomaterno;
    }

    public void setApellidomaterno(String apellidomaterno) {
        this.apellidomaterno = apellidomaterno;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCodigopostal() {
        return codigopostal;
    }

    public void setCodigopostal(String codigopostal) {
        this.codigopostal = codigopostal;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdtutor() {
        return idtutor;
    }

    public void setIdtutor(int idtutor) {
        this.idtutor = idtutor;
    }
    
    
}
