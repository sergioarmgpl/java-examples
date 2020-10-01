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
public class HerenciaPapa {
    public String colorOjos="cafes";
    public int altura;
    public String colorPiel;
    public String enfermedades;
    public HerenciaPapa(){
    
    }
    public void hablar(){
        System.out.println("La la la la");
    }
    public void caminar(){
        System.out.println("Tac tac tac tac");
    }
    public void comer(){
        System.out.println("Crac crac crac");
        hacerDigestion();
    }
    private void hacerDigestion(){
        System.out.println("Estoy procesando los alimentos en el estomago");
    }
}
