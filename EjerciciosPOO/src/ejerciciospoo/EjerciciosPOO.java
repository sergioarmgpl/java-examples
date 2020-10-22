/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospoo;


//import ejerciciospoo.composicion.Moto;
//import ejerciciospoo.herencia.*;
//import ejerciciospoo.operacionesmath.*;
//import ejerciciospoo.composicion.*;
//import ejerciciospoo.ejemplosdiversos.*;
//import ejerciciospoo.interfaces.*;
import ejerciciospoo.abstraccion.*;
import java.util.ArrayList;


/**
 *
 * @author sergio.mendez
 */
public class EjerciciosPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println(args[0]);
        //package ejerciciospoo.herencia.*
        /*Planta p1=new Planta();
        Animal a1=new Animal();
        Microbio m1=new Microbio();
        p1.morir();
        a1.morir();
        m1.morir();
        p1=null;
        a1=null;
        m1=null;*/
        //package ejerciciospoo.operacionesmath
        /*OperacionesAritmeticas oa1=new OperacionesAritmeticas();
        
        System.out.println(oa1.suma(2, 4));
        System.out.println(oa1.resta(2, 4));
        System.out.println(oa1.multiplicacion(2, 4));
        System.out.println(oa1.division(2, 4));
        System.out.println(oa1.division(2.0f, 4.0f));

        Moto mo1=new Moto();*/
        
        //ejerciciospoo.ejemplosdiversos
        /*Tema 1
        Usar herencia para representar la categoría juguetes, donde los juguetes puede ser:
        Nave Espacial, Cohete, Nave de Guerra*/
        /*NaveDeGuerra n1=new NaveDeGuerra();
        n1.encender();
        NaveEspacial n2=new NaveEspacial();
        n2.encender();
        Cohete c1=new Cohete();
        c1.encender();*/
        /*Tema 2
        Usar composición para representar una computadora.
        Computadora: Monitor, Teclado, CPU, Mouse.*/
        /*Computadora micompu=new Computadora();
        micompu.monitor.encender();
        micompu.monitor.apagar();*/
        /*
        Tema 3
        Definir una clase de operaciones matemáticas que incluya los métodos elevado al cuadrado, al cubo y a la cuarta.
        */
        /*OperacionesMatematicas op1=new OperacionesMatematicas();
        System.out.println(op1.cuadrado(2));
        System.out.println(op1.cubo(2));
        System.out.println(op1.cuarta(2));*/
        /*
        Tema 4
        Definir una clase que incluya los siguientes métodos:
        1. Método par, devuelve true si es par el número y false si no lo es.
        2. Método múltiplo, devuelve true si es múltiplo del número que se ingrese, es decir se debe enviar el número y el valor que se desea comprobar si es múltiplo.
        */
        /*Multiplos mm1=new Multiplos();
        System.out.println(mm1.par(23));
        System.out.println(mm1.multiplo(101, 5));*/
        /*
        Tema 5
        Usar herencia para representar la categoría Máquina, y varios tipos de máquina. Incluyendo, encendido y apagado en las implementaciones, sobreescribiendo el apagado en cada clase hijo a implementar.
        */
        /*Tablet mitablet=new Tablet();
        mitablet.encender();
        mitablet.apagar();
        MaquinaDelTiempo mt1=new MaquinaDelTiempo();
        mt1.encender();
        mt1.apagar();*/
        
        //ejerciciospoo.interfaces
        //Distintos tipos con polimorfismo
        //Animal a=new Animal(); //error una interface no se puede instancear
        /*Gato g1=new Gato();
        Perro p1=new Perro();
        Gato g2=new Gato();
        Animal a1=new Gato();
        
        
        ArrayList <Animal>mascotas=new ArrayList();
        
        mascotas.add(g1);//Object
        mascotas.add(p1);
        mascotas.add(g2);
        mascotas.add(new Perro());
        mascotas.add(new Gato());
        
        int n=mascotas.size();
        
        Animal tmp=null;
        
        for(int i=0;i<=(n-1);i++){
            tmp=mascotas.get(i);
            tmp.crecer();
        }
        
        //Solo un tipo
        ArrayList <X>variables=new ArrayList();
        variables.add(new X());
        variables.add(new X());
        variables.add(new X());
        variables.add(new X());
        variables.add(new X());
        X tmp2=null;
        for(int i=0;i<=(n-1);i++){
            tmp2=variables.get(i);
            tmp2.hello();
        }*/
        
        
        //ejerciciospoo.abstraccion
        ArrayList <Animal>mascotas=new ArrayList();
        
        mascotas.add(new Animal1());
        mascotas.add(new Animal1());
        mascotas.add(new Animal2());

        
        int n=mascotas.size();
        
        Animal tmp=null;
        
        for(int i=0;i<=(n-1);i++){
            tmp=mascotas.get(i);
            tmp.morir();
        }
        
    }
    
}
