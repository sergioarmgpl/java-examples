/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospoo.ejemplosdiversos;

/**
 *
 * @author sergio.mendez
 */
public class Multiplos {
    public boolean par(int n){
        if((n % 2)==0)
            return true;
        else
            return false;
    }
    public boolean multiplo(int n,int m){
        if((n % m)==0)
            return true;
        else
            return false;
    }
}
