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
    public int n;
    public int limite=0;
    public ArrayList <Alimento>alimentos=new ArrayList();
    
    public boolean meterAlimento(Alimento tmp){
        boolean agregado=false;
        if(limite<10)
        {
            alimentos.add(tmp);
            agregado=true;
        }
        return agregado;
    }
    public boolean sacarAlimento(String alimento){
        boolean eliminado=false;
        int n=alimentos.size();
        Alimento tmp;
        for(int i=0;i<=(n-1);i++){
            tmp=null;
            tmp=alimentos.get(i);
            if(tmp.nombre.compareTo(alimento)==0)
            {
                alimentos.remove(i);
                eliminado=true;
                break;
            }
        }
        return eliminado;
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
