/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospoo.sobrecarga_sobreescritura;

/**
 *
 * @author sergio.mendez
 */
public class Papa {
    
    public String nombre;
  
    public String devolverNombre(){
        return nombre;
    }
    
    public void ponerNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String decirAlgo(int n){
        String txt = "El número es " +  Integer.toString(n);
        System.out.println(txt);
        return txt;  
    }
    
    public String decirAlgo(String mensaje){
        String txt = "Dire esto: "+mensaje;
        System.out.println(txt);
        return txt;
    }
    
    
}
