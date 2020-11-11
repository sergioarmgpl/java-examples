/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosformularios.refrigeradora;

import java.util.ArrayList;

/**
 *
 * @author sergio.mendez
 */
public class Refrigeradora {
    
    ArrayList <Alimento>alimentos=new ArrayList();
    
    public void meterAlimento(Alimento tmp){
        alimentos.add(tmp);
    }
    public void sacarAlimento(String alimento){
        int n=alimentos.size();
        Alimento tmp;
        for(int i=0;i<=(n-1);i++){
            tmp=null;
            tmp=alimentos.get(i);
            if(tmp.nombre.compareTo(alimento)==0)
                break;
        }
    }
    public void envejecerAlimentos(){
        ArrayList <Alimento>AliActualizado=new ArrayList();
        int n=alimentos.size();
        Alimento tmp;
        for(int i=0;i<=(n-1);i++){
            tmp=null;
            tmp=alimentos.get(i);
            tmp.envejecer();
            AliActualizado.add(tmp);
        }
        alimentos.clear();
        alimentos=AliActualizado;
    }

    public String mostrarAlimentos(){
        String listaAlimentos="";
        int n=alimentos.size();
        String estado="";
        Alimento tmp;
        for(int i=0;i<=(n-1);i++){
            tmp=null;
            tmp=alimentos.get(i);
            if(tmp.getEnBuenEstado())
                estado="Bueno";
            else
                estado="Descompuesto";
            listaAlimentos+= "Alimento: "+tmp.nombre+" estado: "+estado +" tiempo: "+tmp.tiempo;
            listaAlimentos+="\n";
        }
        
        return listaAlimentos;
    }
    
}
