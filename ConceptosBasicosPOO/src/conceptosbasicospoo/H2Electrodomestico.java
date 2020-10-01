/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conceptosbasicospoo;

/**
 *
 * @author sergio.mendez
 */
public class H2Electrodomestico {
    public int voltaje;
    public int watts;
    public String marca;
    public String modelo;
    
    public void encender(){
        System.out.println("Encendiendo");
    }
    
    public void apagar(){
        System.out.println("Apagar");
    }
}
