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
public class ComidaPreparada extends Alimento {
    public ComidaPreparada(String nombre){
        this.nombre=nombre;
    }
    public void envejecer(){
        aumentarTiempo();
        if(tiempo>10)
            this.enBuenEstado = false;
    }
    public void aumentarTiempo(){
        this.tiempo+=1;
    }
}
