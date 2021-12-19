package br.com.adamor.swing.calc.controller;

import br.com.adamor.swing.calc.bean.CalculadoraBean;
import java.lang.Math;

public class CalculadoraController {

    public static float adicao(CalculadoraBean c) {
        return (c.getN1() + c.getN2());
    }

    public static float subtracao(CalculadoraBean c) {
        return (c.getN1() - c.getN2());
    }

    public static float multiplicacao(CalculadoraBean c) {
        return (c.getN1() * c.getN2());
    }

    public static float divisao(CalculadoraBean c) {
        if (c.getN2() == 0) {
            return 0;
        } else {
            return (c.getN1() / c.getN2());
        }

    }

    public static float potencia(CalculadoraBean c) {
        return (float) Math.pow(c.getN1(), c.getN2());
    }
    
}
