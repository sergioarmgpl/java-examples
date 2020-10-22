/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospoo.herencia;

/**
 *
 * @author sergio.mendez
 */
public class SerVivo {
    public SerVivo(){
        nacer();
    }
    public void finalize(){
    
    }
    private void nacer(){
        System.out.println("He nacido");
    }
    public void crecer(){
        System.out.println("Crecer");
    }
    public void reproducir(){
        System.out.println("Reproducir");
    }
    public void morir(){
        System.out.println("Morir");
    }
}
