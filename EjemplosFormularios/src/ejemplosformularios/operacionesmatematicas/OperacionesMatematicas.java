/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosformularios.operacionesmatematicas;

/**
 *
 * @author sergio.mendez
 */
public class OperacionesMatematicas {

    public float suma(float a,float b){
        return a+b;
    }
    
    public float resta(float a,float b){
        return a-b;
    }
    
    public float multiplicacion(float a,float b){
        return a*b;
    }
    
    public float division(float a,float b){
        return a/b;
    }
    
    public boolean multiplo(int a,int b){
        if(a % b == 0)
            return true;
        return false;
    }
    
    public int sumaNv1(int n){
       int i=1;
       int suma=0;
       while(i<=n){
           suma+=i;
           i++;
       }
       return suma;
    }

    public int sumaNv2(int n){
        
       int i=1;
       int suma=0;
       do{
           suma+=i;
           i++;
       }while(i<=n);
       
       return suma;
    }
    
    public String numerosALetrasV1(int n){
        // And -> &&
        // Or -> ||
        // Not -> !
        // != No igual  <> Distinto que
        // == Igual a
        if(n == 1)
            return "Uno";
        else if(n == 2)
            return "Dos";
        else if(n == 3)
            return "Tres";
        else
            return "Desconocido";
    }
    
    public String numerosALetrasV2(int n){
        String nletras="";
        switch(n){
            case 1: { nletras="Uno"; } break;
            case 2: { nletras="Dos"; } break;
            case 3: { nletras="Tres"; } break;
            default: { nletras= "Desconocido"; }
        }
        return nletras;
    }
    
    public int factorial(int n){
        //5 => 1*2*3*4*5
        int mult=1;
        for(int i=1;i<=n;i++)
           mult=mult*i;
 
        return mult;
    }
    
    public boolean mayor(int a,int b){
       if(a>b)
           return true;
       return false;
    }
    
    public float sumaArmonica(int n){
       //5 => 1/1+1/2+1/3+1/4+1/5
       float suma=0.0f;
       for(int i=1;i<=n;i++)
       {
           suma=suma+1/((float)i);
       }
       return suma;
    }
}
