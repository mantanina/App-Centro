/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Terapias;

/**
 *
 * @author 1234
 */

/*
Este metodo nos permite meterle 
la los datos de las terapias
*/
public class DatosTerapia {
    private int id;
    private String terapia;
    

    public DatosTerapia(int id, String terapia) {
        this.id = id;
        this.terapia = terapia;
    }

    public DatosTerapia() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTerapia() {
        return terapia;
    }

    public void setTerapia(String terapia) {
        this.terapia = terapia;
    }
    
    
}
