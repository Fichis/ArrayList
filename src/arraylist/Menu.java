/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Menu {
    
    ArrayList<String> listamenu = new ArrayList<String>();

    public void creaOpcion(String opcion){
        listamenu.add(opcion);
    }
    
    public void muestraMenu(){
        for(int i=0; i<listamenu.size();i++){
            System.out.println(i+". "+listamenu.get(i));
        }
    }
    
    public void capturaOpcion(){
        Scanner sc = new Scanner(System.in);
        GestSimAlm simulador = new GestSimAlm();
        int opcion;
        
        do{
            System.out.println("Elige una opcion (0 - "+(listamenu.size()-1)+")");
            opcion = sc.nextInt();
            switch (opcion) {
                case 0 -> {
                    simulador.entradaAutomatizada();
                }
                case 1 -> {
                    System.out.println("Lista de articulos:");
                    System.out.println(simulador);
                    simulador.lista();
                }
                case 2 -> {
                    simulador.alta();
                }
                case 3 -> {
                    simulador.baja();
                }
                case 4 -> {
                    int cant;
                    System.out.println("Cuantas unidades quieres agregar?");
                    cant=sc.nextInt();
                    simulador.entradaMercancia(cant);
                }
                case 5 -> {
                    int cant;
                    System.out.println("Cuantas unidades quieres quitar?");
                    cant=sc.nextInt();
                    simulador.salidaMercancia(cant);
                }
                case 6 -> {
                    break;
                }
                default -> {
                    System.out.println("No es una opcion valida, elige un numero entre 0 y "+(listamenu.size()));
                }
            }
            
            this.muestraMenu();
        }while(opcion!=6);
        
    }
}
