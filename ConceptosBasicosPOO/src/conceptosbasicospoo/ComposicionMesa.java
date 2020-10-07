/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conceptosbasicospoo;

/**
 *
 * @author sergio.mendez
 */
public class ComposicionMesa {
    public ComposicionMesa(){
        System.out.println("Mesa");
    }
    public ComposicionSuperficieMesa sm=new ComposicionSuperficieMesa();
    public ComposicionPataMesa pata1=new ComposicionPataMesa();
    public ComposicionPataMesa pata2=new ComposicionPataMesa();
    public ComposicionPataMesa pata3=new ComposicionPataMesa();
    public ComposicionPataMesa pata4=new ComposicionPataMesa();
}
