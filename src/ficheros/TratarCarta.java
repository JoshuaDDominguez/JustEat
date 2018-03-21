/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import justeat.Direccion;
import loading.ClaseLoading;

/**
 *
 * @author jdominguezdominguez
 */
public class TratarCarta {

    public static ArrayList<Carta> cartas = new ArrayList<>();
    Float precio;
    

//    Scanner sc = new Scanner(new File (""));
//    String[] ref = sc.nextLine().split(" * ");
    /**
     *
     * @param local
     * @return
     */
    public ArrayList<Carta> cargarCarta(String local) {
        switch (local) {
            case "Kebab":
                try (Scanner sc = new Scanner(new File("Kebab.txt"))) {
                    while (sc.hasNextLine()) {
                        String[] ref = sc.nextLine().split(" * ");
                        Carta carta = new Carta(ref[0], Float.parseFloat(ref[2]));

                        cartas.add(carta);
                    }
                    for (int i = 0; i < cartas.size(); i++) {
                        System.out.println(cartas.get(i).getNombre() + " - " + cartas.get(i).getPrecio() + "€");
                    }

                } catch (FileNotFoundException ex) {
                    Logger.getLogger(TratarCarta.class.getName()).log(Level.SEVERE, null, ex);
                }

                break;

            case "Americano":
                try (Scanner sc = new Scanner(new File("Americano.txt"))) {
                    while (sc.hasNextLine()) {
                        String[] ref = sc.nextLine().split(" * ");
                        Carta carta = new Carta(ref[0], Float.parseFloat(ref[2]));
                        cartas.add(carta);
                    }
                    for (int i = 0; i < cartas.size(); i++) {
                        System.out.println(cartas.get(i).getNombre() + " - " + cartas.get(i).getPrecio() + "€");
                    }
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(TratarCarta.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;

            case "Pizzeria":
                try (Scanner sc = new Scanner(new File("Pizzeria.txt"))) {
                    while (sc.hasNextLine()) {
                        String[] ref = sc.nextLine().split(" * ");
                        Carta carta = new Carta(ref[0], Float.parseFloat(ref[2]));
                        cartas.add(carta);
                    }
                    for (int i = 0; i < cartas.size(); i++) {
                        System.out.println(cartas.get(i).getNombre() + " - " + cartas.get(i).getPrecio() + "€");
                    }
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(TratarCarta.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;

            case "Chino":
                try (Scanner sc = new Scanner(new File("Chino.txt"))) {
                    while (sc.hasNextLine()) {
                        String[] ref = sc.nextLine().split(" * ");
                        Carta carta = new Carta(ref[0], Float.parseFloat(ref[2]));
                        cartas.add(carta);
                    }
                    for (int i = 0; i < cartas.size(); i++) {
                        System.out.println(cartas.get(i).getNombre() + " - " + cartas.get(i).getPrecio() + "€");
                    }
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(TratarCarta.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;

            case "Espanol":
                try (Scanner sc = new Scanner(new File("Espanol.txt"))) {
                    while (sc.hasNextLine()) {
                        String[] ref = sc.nextLine().split(" * ");
                        Carta carta = new Carta(ref[0], Float.parseFloat(ref[2]));
                        cartas.add(carta);
                    }
                    for (int i = 0; i < cartas.size(); i++) {
                        System.out.println(cartas.get(i).getNombre() + " - " + cartas.get(i).getPrecio() + "€");
                    }
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(TratarCarta.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;

            case "Italiano":
                try (Scanner sc = new Scanner(new File("Italiano.txt"))) {
                    while (sc.hasNextLine()) {
                        String[] ref = sc.nextLine().split(" * ");
                        Carta carta = new Carta(ref[0], Float.parseFloat(ref[2]));
                        cartas.add(carta);
                    }
                    for (int i = 0; i < cartas.size(); i++) {
                        System.out.println(cartas.get(i).getNombre() + " - " + cartas.get(i).getPrecio() + "€");
                    }
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(TratarCarta.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;

            default:
                break;
        }
        return cartas;
    }

}
