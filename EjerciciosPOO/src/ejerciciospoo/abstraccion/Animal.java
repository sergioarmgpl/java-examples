/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospoo.abstraccion;

/**
 *
 * @author sergio.mendez
 */
public abstract class Animal {
    public void nacer(){
        System.out.println("Nacer");
    }
    public void crecer(){
        System.out.println("Crecer");
    }
    public abstract void reproducir();
    public abstract void morir();
}
