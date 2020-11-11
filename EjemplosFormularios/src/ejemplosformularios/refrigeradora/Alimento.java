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
public abstract class Alimento {
    
    public boolean enBuenEstado=true;
    public int tiempo=0;
    public String nombre;
    
    public abstract void envejecer();
    public abstract void aumentarTiempo();
    
    public boolean getEnBuenEstado(){
        return enBuenEstado;
    }
}
