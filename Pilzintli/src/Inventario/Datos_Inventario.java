/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventario;

/**
 *
 * @author 1234
 */
public class Datos_Inventario {
    private int id_inventario;
    private String nombre_articulo;
    private int cantidad_disponible;
    private String fecha_entrada;
    private String fecha_salida;
    
    public Datos_Inventario(){
        
    }

    public Datos_Inventario(int id_inventario, String nombre_articulo, int cantidad_disponible, String fecha_entrada, String fecha_salida) {
        this.id_inventario = id_inventario;
        this.nombre_articulo = nombre_articulo;
        this.cantidad_disponible = cantidad_disponible;
        this.fecha_entrada = fecha_entrada;
        this.fecha_salida = fecha_salida;
    }
    
    

    public int getId_inventario() {
        return id_inventario;
    }

    public void setId_inventario(int id_inventario) {
        this.id_inventario = id_inventario;
    }

    public String getNombre_articulo() {
        return nombre_articulo;
    }

    public void setNombre_articulo(String nombre_articulo) {
        this.nombre_articulo = nombre_articulo;
    }

    public int getCantidad_disponible() {
        return cantidad_disponible;
    }

    public void setCantidad_disponible(int cantidad_disponible) {
        this.cantidad_disponible = cantidad_disponible;
    }

    public String getFecha_entrada() {
        return fecha_entrada;
    }

    public void setFecha_entrada(String fecha_entrada) {
        this.fecha_entrada = fecha_entrada;
    }

    public String getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(String fecha_salida) {
        this.fecha_salida = fecha_salida;
    }
    
    
    
}
