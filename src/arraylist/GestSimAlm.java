/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylist;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class GestSimAlm {
    Scanner sc = new Scanner(System.in);
    
    ArrayList<Articulo> articulosLista = new ArrayList<Articulo>();

       
    public void entradaAutomatizada(){
        
        for(int i=0; i<4; i++){
            articulosLista.add(new Articulo("Articulo automatico "+(i+1)));
        }
        
    }
    
    public void lista(){
        
        for(int i=0; i<articulosLista.size();i++){
            System.out.println("Codigo: "+articulosLista.get(i).getCodigo());
            System.out.println("Descripcion: "+articulosLista.get(i).getDesc());
            System.out.println("Precio de compra: "+articulosLista.get(i).getPrecioc());
            System.out.println("PVP: "+articulosLista.get(i).getPreciov());
            System.out.println("Stock: "+articulosLista.get(i).getStock());
            System.out.println("-----------------------------");
        }
    }
    
    public void alta(){
        String desc;
        System.out.println("Que descripcion tendra el articulo?");
        desc=sc.next();
        articulosLista.add(new Articulo(desc));
        
    }
    
    public void baja() {
        int pos;
        try {
            System.out.println("En que posicion de la lista esta el articulo a dar de baja? (1 - " + articulosLista.size() + ")");
            pos = sc.nextInt();
            System.out.println("El articulo " + articulosLista.get(pos - 1) + " ha sido dado de baja");
            articulosLista.remove(articulosLista.get(pos - 1));
        } catch (Exception e) {
            System.out.println("El numero no es valido");
        }
    }
    
    public void entradaMercancia(int cant){
        int pos;
        try {
            System.out.println("En que posicion de la lista esta el articulo a agregar unidades? (1 - " + articulosLista.size() + ")");
            pos = sc.nextInt();
            System.out.println("Se le han aniadido "+cant+" unidades al articulo: " + articulosLista.get(pos - 1));
            articulosLista.get(pos-1).setStock(articulosLista.get(pos-1).getStock()+cant);
            System.out.println("Unidades actuales: "+articulosLista.get(pos-1).getStock());
        } catch (Exception e) {
            System.out.println("El numero no es valido");
        }
        
    }
    
    public void salidaMercancia(int cant){
        int pos=0;
        try {
            System.out.println("En que posicion esta el articulo a quitar cantidad?");
            pos=sc.nextInt();
            while(cant > 0){
                if(articulosLista.get(pos-1).getStock()==0 && cant>0){
                    System.out.println("No hay suficientes articulos, faltan "+cant+" por sacar.");
                    break;
                }else{
                    articulosLista.get(pos-1).setStock((articulosLista.get(pos-1).getStock())-1);
                    cant--;
                }
            }
        } catch (Exception e) {
            System.out.println("El numero no es valido");
        }
        System.out.println("Quedan: "+articulosLista.get(pos-1).getStock()+" articulos disponibles.");
        
    }
    
    @Override
    public String toString(){
        return this.articulosLista.toString();
    }
    
}
