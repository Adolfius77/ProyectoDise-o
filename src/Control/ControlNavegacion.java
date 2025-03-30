/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import DTOS.LibroDTO;
import Presentacion.GUICambioContraseña;
import Presentacion.GUICarrito;
import Presentacion.GUICategorias;
import Presentacion.GUIEnvioDHL;
import Presentacion.GUIEnvioEstafeta;
import Presentacion.GUIINICIO;
import Presentacion.GUIPaginaPagos;
import Presentacion.GUIPagoMastercard;
import Presentacion.GUIPagoPaypal;
import Presentacion.GUIPerfil;
import Presentacion.GUISeleccionMetodoEnvio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class ControlNavegacion {
    private static  ControlNavegacion instancia;

    public ControlNavegacion() {
        this.carrito = new ArrayList<>();
    }
    public static synchronized ControlNavegacion getInstase(){
        if(instancia == null){
            instancia = new ControlNavegacion();
        }
        return  instancia;
    }
    private List<LibroDTO> carrito;
    
    public List<LibroDTO> getCarrito(){
        return carrito;
    }
    public void limpiarCarrito(){
        if(this.carrito != null){
            this.carrito.clear();
        }
        System.out.println("carrito limpiado");
    }
    public void navegarInicio(JFrame frameActual){
        GUIINICIO inicio = new GUIINICIO();
        inicio.setVisible(true);
        if(frameActual != null){
            frameActual.dispose();
        }
    }
    public void navegarCategorias(JFrame frameActual){
        GUICategorias categorias = new GUICategorias();
        categorias.setVisible(true);
        if(frameActual != null){
            frameActual.dispose();
        }
    }
    public void navegarPerfil(JFrame frameActual){
        GUIPerfil perfil = new GUIPerfil();
        perfil.setVisible(true);
        if(frameActual != null){
            frameActual.dispose();
        }
    }
    public void navegarCarrito(JFrame frameActual){
        GUICarrito carrito = new GUICarrito(this.carrito);
        carrito.setVisible(true);
        if (frameActual != null) {
            frameActual.dispose();
        }
    }
    public void navegarCambioPasssword(JFrame frameActual){
        GUICambioContraseña contra = new GUICambioContraseña();
        contra.setVisible(true);
        if (frameActual != null) {
            frameActual.dispose();
        }
    }
    public void navegarPaginaPagos(JFrame frameActual){
        GUIPaginaPagos paginaPagos = new GUIPaginaPagos();
        paginaPagos.setVisible(true);
        if(frameActual != null){
            frameActual.dispose();
        }
    }
    public void navegarPagoConTarjeta(JFrame frameActual){
        GUIPagoMastercard Mastercard = new GUIPagoMastercard();
        Mastercard.setVisible(true);
        if (frameActual != null) {
            frameActual.dispose();
        }
    }
    public void navegarPaypal(JFrame frameActual){
        GUIPagoPaypal paypal = new GUIPagoPaypal();
        paypal.setVisible(true);
        if (frameActual != null) {
            frameActual.dispose();
            
        }
    }
    public void navegarSeleccionEnvio(JFrame frameActual){
        GUISeleccionMetodoEnvio MetodoEnvio = new GUISeleccionMetodoEnvio();
        MetodoEnvio.setVisible(true);
        if (frameActual != null) {
            frameActual.dispose();
            
        }
    }
    public void navegarEnvioEstafeta(JFrame frameActual){
       GUIEnvioEstafeta estafeta = new GUIEnvioEstafeta();
       estafeta.setVisible(true);
       if(frameActual != null){
           frameActual.dispose();
       }
    }
    public void navegarEnvioDHL(JFrame frameActual){
        GUIEnvioDHL dhl = new GUIEnvioDHL();
        dhl.setVisible(true);
        if (frameActual != null) {
            frameActual.dispose();
            
        }
    }
    public void cerrarSesion(JFrame frameActual){
        limpiarCarrito();
        
        JOptionPane.showMessageDialog(frameActual, "todavia no agrego esta parte xd");
        if (frameActual !=null) {
            frameActual.dispose();
            
        }
    }
    
}
