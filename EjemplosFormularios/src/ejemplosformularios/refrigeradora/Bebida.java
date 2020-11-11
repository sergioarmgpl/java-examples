/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosformularios.refrigeradora;

/**
 *
 * @author sergio.mendez
 */
public class Bebida extends Alimento {
    public Bebida(String nombre){
        this.nombre=nombre;
    }
    public void envejecer(){
        aumentarTiempo();
        if(tiempo>90)
            this.enBuenEstado = false;
    }
    public void aumentarTiempo(){
        this.tiempo+=1;
    }
}
