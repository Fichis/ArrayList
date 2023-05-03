/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylist;

/**
 *
 * @author usuario
 */
public class Articulo {
    private static int autonumerico=0;
    private int codigo;
    private String desc;
    private double precioc;
    private double preciov;
    private int stock;
    
    public Articulo(int codigo, String desc){
        this.codigo=codigo;
        this.desc=desc;
    }

    public Articulo(String desc) {
        this.codigo=++autonumerico;
        this.desc = desc;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrecioc() {
        return this.precioc;
    }

    public void setPrecioc(double precioc) {
        this.precioc = precioc;
    }

    public double getPreciov() {
        return this.preciov;
    }

    public void setPreciov(double preciov) {
        this.preciov = preciov;
    }

    public int getStock() {
        return this.stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    @Override
    public String toString(){
        return this.desc;
        
    }
    
}
