package CalculoIMC;

import java.util.Scanner;


public class CalcularIMC {
    public static void main(String [] args){Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese su peso en kilogramos: ");
        float peso = entrada.nextFloat();
        System.out.println("Ingrese su altura en metros: ");
        float altura = entrada.nextFloat();

        float IMC = calcularIMC(peso,altura);

        System.out.println("Tu indice de masa corporal es: "+IMC);
        entrada.close();
    }

    public static float calcularIMC(float peso, float altura) {
        return peso / (altura*altura);
    }
}