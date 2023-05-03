/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist;

/**
 *
 * @author usuario
 */
public class ArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Articulo a = new Articulo(15, "Raton");
        Articulo b = new Articulo(16, "Monitor");
        AlmArticulo almacen = new AlmArticulo();
        almacen.Almacena(a);
        almacen.Almacena(b);
        System.out.println(almacen);
        
    }
        
}
