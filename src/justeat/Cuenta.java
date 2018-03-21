/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package justeat;

import ficheros.Carta;
import ficheros.TratarCarta;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Joshua
 */
public class Cuenta {

    ArrayList<Carta> cartas = TratarCarta.cartas;
    Carta carta = null;
    Double precio = (double) 0;

    public Double cuentaTotal() {
        Boolean exit = false;

        String producto = "2";

        do {
            try {
                producto = JOptionPane.showInputDialog("Elija producto");

                if (producto != null) {
                    this.sumarCuenta(producto);
                } else {
                    exit = true;
                }

            } catch (NullPointerException ex) {
                exit = true;
            }
        } while (exit != true);

        return precio;
    }

    public void sumarCuenta(String producto) {

        for (int i = 0; i < cartas.size(); i++) {
            if (cartas.get(i).getNombre().equalsIgnoreCase(producto)) {
                precio += cartas.get(i).getPrecio();
            }
        }

    }
}
