/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosformularios.votacionestrump;

/**
 *
 * @author sergio.mendez
 */
public class Papeleta {
    private String color;
    private String candidato;
    private String id;
    public Papeleta(String color,String candidato){
        this.color = color;
        this.candidato = candidato;
    }
    public String getColor(){
        return color;
    }
    public String getCandidato(){
        return candidato;
    }
}
