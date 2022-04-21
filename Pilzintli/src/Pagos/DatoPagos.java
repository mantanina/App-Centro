/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pagos;

/**
 *
 * @author Arreola N
 */
public class DatoPagos {
 private int id;
private String cantidad;
private int consulta_id;

    public DatoPagos() {
    }

    public DatoPagos(int id, String cantidad, int consulta_id) {
        this.id = id;
        this.cantidad = cantidad;
        this.consulta_id = consulta_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public int getConsulta_id() {
        return consulta_id;
    }

    public void setConsulta_id(int consulta_id) {
        this.consulta_id = consulta_id;
    }
   

}


