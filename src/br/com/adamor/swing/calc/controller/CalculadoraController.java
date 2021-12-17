package br.com.adamor.swing.calc.controller;

import java.lang.Math;

public class CalculadoraController {

    public static float adicao(float n1, float n2) {
        return (n1 + n2);
    }

    public static float subtracao(float n1, float n2) {
        return (n1 - n2);
    }

    public static float multiplicacao(float n1, float n2) {
        return (n1 * n2);
    }

    public static float divisao(float n1, float n2) {
        if (n2 == 0) {
            return 0;
        } else {
            return (n1 / n2);
        }

    }

    public static float potencia(float n1, float n2) {
        return (float) Math.pow(n1, n2);
    }
}
