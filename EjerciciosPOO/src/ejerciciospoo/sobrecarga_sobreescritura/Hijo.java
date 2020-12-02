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
public class Hijo extends Papa {
    public String devolverNombre(){
        return "Jr."+nombre;
    }
}
