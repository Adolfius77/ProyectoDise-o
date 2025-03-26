/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTOS;

/**
 *
 * @author riosr
 */
public class DTOPayPal {
    private String correoElectronico;
    private String contraseña;
    private int tarjetasVinculadas;

    public DTOPayPal(String correoElectronico, String contraseña, int tarjetasVinculadas) {
        this.correoElectronico = correoElectronico;
        this.contraseña = contraseña;
        this.tarjetasVinculadas = tarjetasVinculadas;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getTarjetasVinculadas() {
        return tarjetasVinculadas;
    }

    public void setTarjetasVinculadas(int tarjetasVinculadas) {
        this.tarjetasVinculadas = tarjetasVinculadas;
    }
    
    
}
