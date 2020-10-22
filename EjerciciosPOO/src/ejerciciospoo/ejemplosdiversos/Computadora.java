/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospoo.ejemplosdiversos;

/**
 *
 * @author sergio.mendez
 */
public class Computadora {
    public CPU cpu=new CPU();
    public Monitor monitor=new Monitor();
    public Teclado teclado=new Teclado();
    public Mouse mouse=new Mouse();
    public Computadora(){
        System.out.println("Computadora");
    }
}
