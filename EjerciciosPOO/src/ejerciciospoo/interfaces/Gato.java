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
public class Gato implements Animal {
    public void morir(){
        System.out.println("Gato morir");
    }
    public void reproducir(){
        System.out.println("Gato reproducir");
    }
    public void crecer(){
        System.out.println("Gato crecer");
    }
    public void nacer(){
        System.out.println("Gato nacer");
    }    
}
