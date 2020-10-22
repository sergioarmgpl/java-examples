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
public class ConceptosBasicosPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Ejemplo encapsulamiento
        Encapsulamiento E=new Encapsulamiento();
        System.out.println(E.funcion1(1, 2));
        System.out.println(E.funcion2(2, 2));
        //Ejemplo polimorfismo1
        Polimorfismo1 P=new Polimorfismo1();
        System.out.println(P.suma(1,2));
        System.out.println(P.suma(1,2,3));
        System.out.println(P.suma(1,2,3,4));
        //Ejemplo Herencia Padre Hijo
        HerenciaPapa p1=new HerenciaPapa();
        HerenciaHijo h1=new HerenciaHijo();
        h1.hablar();
        h1.comer();
        System.out.println(h1.colorOjos);
        //Ejemplo Herencia Electrodomesticos
        H2HornoMicroondas ho1=new H2HornoMicroondas();
        ho1.encender();
        H2Lavadora l1=new H2Lavadora();
        l1.encender();
        H2Refrigeradora r1=new H2Refrigeradora();
        r1.encender();
        //Ejemplo de sobre carga de método del padre
        H3Hijo h3=new H3Hijo();
        System.out.println(h3.colorOjos);
        h3.hablar();//Comparar con el h1 el resultado de hablar
        //Manejo de errores
        ManejoErrores e=new ManejoErrores();
        e.dividir(3, 0);
        //Ejemplo composición Mesa
        ComposicionMesa mesa1=new ComposicionMesa();

    }
    
}
