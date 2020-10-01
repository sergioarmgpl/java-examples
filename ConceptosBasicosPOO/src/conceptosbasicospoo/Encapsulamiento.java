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
public class Encapsulamiento {
    //Globales a los métodos
    public int var1;
    public int var2;
    private int var3;
    //Se lanza al crear el objeto
    public Encapsulamiento(){
        System.out.println("Este es el constructor");
        Inicializar();
    }
    public void MetodoPublico(){
        System.out.println("Método Público");
    }
    //Método privado
    private void Inicializar(){
        System.out.println("Mande a llamar a inicializar");
        var1=0;
        var2=0;
        var3=0;
    }
    //método público
    public int funcion1(int a,int b){
        return a+b;
    }
    //parámetros son locales a funcion2
    public int funcion2(int var1,int var2){
        //var3 no es el var3 global en este caso para acceder al global se
        //usa el prefijo this.
        int var3=2;
        this.var3=var3;//var3 global toma el valor de 2
        //asignación a var1 y var2 a partir de los parametros recibidos
        this.var1=var1;
        this.var2=var2;
        this.var3=var3;
        return 1;
    }
}
