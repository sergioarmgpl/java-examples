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
public class Polimorfismo1 {
    
    public  Polimorfismo1(){
        System.out.println("Constructor");
    }
    //Sobrecarga, distintas versiones de 1 método
    public int suma(int v1,int v2){
        return v1+v2;
    }
    
    public int suma(int v1,int v2,int v3){
        return v1+v2+v3;
    }
    
    public int suma(int v1,int v2,int v3,int v4){
        return v1+v2+v3+v4;
    }
}
