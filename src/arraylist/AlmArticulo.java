/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylist;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class AlmArticulo {
    ArrayList<Articulo> listaArt = new ArrayList<Articulo>();
    
    
    public void Almacena(Articulo a){
        this.listaArt.add(a);
    }
    
    @Override
    public String toString(){
        return this.listaArt.toString();
    }
    
}
