/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylist;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class TestGestSimAlm {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int opcion;
        String[] listaopciones = {"Entrada automatizada (creara 4 articulos de prueba del programa)",
                                "Listado (Mostrara todos los datos de los articulos del almacen)",
                                "Alta (Aniadira un nuevo articulo en el almacen)",
                                "Baja (Dara de baja un articulo en el almacen)",
                                "Entrada de mercancia (Aumentara el stock de un determinado articulo)",
                                "Salida de mercancia (Disminuira el stock de un determinado articulo)",
                                "Salir"};
        
        GestSimAlm simulador = new GestSimAlm();
        
        
        do{
            System.out.println("MENU ALMACEN");
            System.out.println("==============");
            for(int i=0; i<listaopciones.length;i++){
                System.out.println((i)+" "+listaopciones[i]);
            }
            System.out.println("Elige una opcion: (0 - "+(listaopciones.length-1)+")");
            opcion=sc.nextInt();
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
                    System.out.println("No es una opcion valida, elige un numero entre 0 y "+(listaopciones.length-1));
                }
            }
        }while(opcion!=6);
        
        
    }
    
}
