/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylist;

/**
 *
 * @author usuario
 */
public class TestMenu {
    public static void main(String[] args) {
        // TODO code application logic here
        
        Menu menu = new Menu();
        menu.creaOpcion("Entrada automatizada (creara 4 articulos de prueba del programa)");
        menu.creaOpcion("Listado (Mostrara todos los datos de los articulos del almacen)");
        menu.creaOpcion("Alta (Aniadira un nuevo articulo en el almacen)");
        menu.creaOpcion("Baja (Dara de baja un articulo en el almacen)");
        menu.creaOpcion("Entrada de mercancia (Aumentara el stock de un determinado articulo)");
        menu.creaOpcion("Salida de mercancia (Disminuira el stock de un determinado articulo)");
        menu.creaOpcion("Salir");
        menu.muestraMenu();
        menu.capturaOpcion();
        
    }
}
