/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

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
import javax.swing.JFrame;

/**
 *
 * @author USER
 */
public class ControlNavegacion implements ActionListener {

    private JFrame ventanaActual;

    public ControlNavegacion(JFrame ventanaActual) {
        this.ventanaActual = ventanaActual;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();

        switch (comando) {
            case "INICIO":
                abrirVentana(new GUIINICIO());
                break;
            case "CATEGORIAS":
                abrirVentana(new GUICategorias());
                break;
            case "CARRITO":
                abrirVentana(new GUICarrito());
                break;
            case "PERFIL":
                abrirVentana(new GUIPerfil());
                break;
            case "CAMBIO CONTRASENA":
                abrirVentana(new GUICambioContraseña());
                break;
            case "ENVIO DHL":
                abrirVentana(new GUIEnvioDHL());
                break;
            case "ENVIO ESTAFETA":
                abrirVentana(new GUIEnvioEstafeta());
                break;
            case "PAGINA PAGOS":
                abrirVentana(new GUIPaginaPagos());
                break;
            case "MASTERCARD":
                abrirVentana(new GUIPagoMastercard());
                break;
            case "PAYPAL":
                abrirVentana(new GUIPagoPaypal());
                break;
            case "METODO ENVIO":
                abrirVentana(new GUISeleccionMetodoEnvio());
                break;
        }
    }

    private void abrirVentana(JFrame nuevaVentana) {
        nuevaVentana.setVisible(true);
        ventanaActual.dispose();
    }
}
