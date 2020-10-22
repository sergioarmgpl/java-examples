/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospoo.interfaces;

/**
 *
 * @author sergio.mendez
 */
public class Perro implements Animal {
    public void morir(){
        System.out.println("Perro morir");
    }
    public void reproducir(){
        System.out.println("Perro reproducir");
    }
    public void crecer(){
        System.out.println("Perro crecer");
    }
    public void nacer(){
        System.out.println("Perro nacer");
    }    
}
