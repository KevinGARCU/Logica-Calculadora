/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author Estudiantes
 */
public class Calculadora {
    
    private int numero1;
    private int numero2;
    private int resultado;
    
    public void setNumero1 (int valor){
        this.numero1=valor;
    }
    
    public void setNumero2(int valor){
        this.numero2=valor;
    }
    
    public int getResultado(){
        return this.resultado;
    }
    
    public void sumar(){
        this.resultado=this.numero1+this.numero2;
    }
    
    public void resta(){
        this.resultado=this.numero1-this.numero2;
    }
    
    public void multiplicacion(){
        this.resultado=this.numero1*this.numero2;
    }
    
    public void division(){
        this.resultado=this.numero1/this.numero2;
    }
    
    
}
