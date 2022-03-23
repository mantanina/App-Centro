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
    private String user;
    private String contraseña;

   public DatoUsuarios(){
}

    public DatoUsuarios(String user, String contraseña) {
        this.user = user;
        this.contraseña = contraseña;
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

   
}
