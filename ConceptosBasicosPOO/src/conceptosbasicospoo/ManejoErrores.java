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
public class ManejoErrores {
    
    public void dividir(int a,int b){
        try{
            
            int c = a/b;
            System.out.println(c);
            
            
        }catch(Exception E){
            System.out.println("Error división 0");
        }
    }
    
}
