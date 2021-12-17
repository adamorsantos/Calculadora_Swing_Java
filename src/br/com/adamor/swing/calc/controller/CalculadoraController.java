package br.com.adamor.swing.calc.controller;

import java.lang.Math;


public class CalculadoraController {
    
        
    public float adicao(float n1, float n2){
        return (n1+n2);  
    }
    
    public float subtracao(float n1, float n2){
        return (n1-n2);  
    }
    
    public float multiplicacao(float n1, float n2){
        return (n1*n2);  
    }
    
    public float divisao(float n1, float n2){
        return (n1/n2);  
    }
    
    public float potencia(float n1, float n2){
        return (float) Math.pow(n1,n2);  
    }
}
