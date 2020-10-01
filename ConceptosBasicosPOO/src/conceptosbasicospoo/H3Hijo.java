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
public class H3Hijo extends HerenciaPapa{

    public H3Hijo(){
        this.colorOjos="azules";
    }
    //Sobreescribe el método hablar de HerenciaPapa
    public void hablar(){
        System.out.println("Holaaaa");
    }
    
}
