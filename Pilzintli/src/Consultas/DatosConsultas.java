/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Consultas;

/**
 *
 * @author Arreola N
 */
public class DatosConsultas {

    private int id;
    private String fecha;
    private String hora;
    private int paciente_id;
    private int especialista_id;
    private int tipo_consulta_id;
    private int terapia_id;

    public DatosConsultas() {
    }

    public DatosConsultas(int id, String fecha, String hora, int paciente_id, int especialista_id, int tipo_consulta_id, int terapia_id) {
        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
        this.paciente_id = paciente_id;
        this.especialista_id = especialista_id;
        this.tipo_consulta_id = tipo_consulta_id;
        this.terapia_id = terapia_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getPaciente_id() {
        return paciente_id;
    }

    public void setPaciente_id(int paciente_id) {
        this.paciente_id = paciente_id;
    }

    public int getEspecialista_id() {
        return especialista_id;
    }

    public void setEspecialista_id(int especialista_id) {
        this.especialista_id = especialista_id;
    }

    public int getTipo_consulta_id() {
        return tipo_consulta_id;
    }

    public void setTipo_consulta_id(int tipo_consulta_id) {
        this.tipo_consulta_id = tipo_consulta_id;
    }

    public int getTerapia_id() {
        return terapia_id;
    }

    public void setTerapia_id(int terapia_id) {
        this.terapia_id = terapia_id;
    }

}
