/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospoo.composicion;

import ejerciciospoo.composicion.Volante;

/**
 *
 * @author sergio.mendez
 */
public class Moto {
    public Volante v1=null;
    public Llanta ll1=null;
    public Llanta ll2=null;
    public Escape e1=null;
    public Moto(){
        v1=new Volante();
        ll1=new Llanta();
        ll2=new Llanta();
        e1=new Escape();
    }
}
