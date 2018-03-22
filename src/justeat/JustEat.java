/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package justeat;

import ficheros.Carta;
import ficheros.TratarCarta;
import java.util.ArrayList;
import loading.ClaseLoading;

/**
 *
 * @author Gonzalo
 */
public class JustEat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ClaseLoading load = new ClaseLoading();

        Direccion dir = new Direccion();
        TratarCarta carta = new TratarCarta();
        Window ventana = new Window();
        Cuenta cuenta = new Cuenta();
        ArrayList<Carta> cartas = new ArrayList<>();

        String calle = dir.selCalle();
        load.loading();
        String local = dir.selRest(calle);
        load.loading();
        carta.cargarCarta(local);
        load.basicDisplay(String.valueOf("Total del pedido: " + cuenta.cuentaTotal() + "€"));

        ventana.setVisible(true);

    }

}
