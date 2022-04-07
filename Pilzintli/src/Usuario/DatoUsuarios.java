/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuario;

/**
 *
 * @author Arreola N
 */
public class DatoUsuarios {
private int id;
    private String user;
    private String contraseña;
 private int status;


   public DatoUsuarios(){
}

    public DatoUsuarios(int id, String user, String contraseña, int status) {
        this.id = id;
        this.user = user;
        this.contraseña = contraseña;
        this.status = status;
       
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
 
   
}
