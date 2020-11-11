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
public class Verdura extends Alimento {
    
    public Verdura(String nombre){
        this.nombre=nombre;
    }
        
    public void envejecer(){
        aumentarTiempo();
        if(tiempo>5)
            this.enBuenEstado = false;
    }
    public void aumentarTiempo(){
        this.tiempo+=1;
    }
}