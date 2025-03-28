package br.com.fecaf.model;

import java.util.Scanner;

public class Triangulo {

    // Atributos Triangulo
    public double base, altura, lado2, lado3, area, perimetro;

    Scanner scanner = new Scanner(System.in);

    public boolean cadastrarTriangulo() {
        System.out.println("/***************************/");
        System.out.println("/*  Cadastrando Triangulo  */");
        System.out.println("/***************************/");
        System.out.println("/* Informe a base:         */");
        base = scanner.nextDouble();
        System.out.println("/* Informe o lado 2:         ");
        lado2 = scanner.nextDouble();
        System.out.println("/* Informe o lado 3:         ");
        lado3 = scanner.nextDouble();
        System.out.println("/* Informe a altura:         ");
        altura = scanner.nextDouble();
        System.out.println("/***************************/");

        return true;
    }

    // Calcula Area Triangulo
    public void calcularArea() {
        System.out.println("/***************************/");
        System.out.println("/*     Calculando Area     */");
        System.out.println("/***************************/");

        area = (base * altura) / 2;
        System.out.println("A area é: " + area);
        System.out.println("/***************************/");
    }

    public void calcularPerimetro () {
        System.out.println("/****************************/");
        System.out.println("/*   Calculando Perimetro   */");
        System.out.println("/****************************/");

        perimetro = base + lado2 + lado3;
        System.out.println("O perimetro é: " + perimetro);
        System.out.println("/****************************/");
    }

    // Definir tipo do Triangulo

    // Equilátero - Escaleno - Isósceles

    public void definirTipo() {
        System.out.println("/****************************/");
        System.out.println("/* Definindo Tipo Triangulo */");
        System.out.println("/****************************/");

        if (base == lado2 && base == lado3) {
            System.out.println("Esse triangulo é um Equilátero...");

        } else if (base != lado2 && base != lado3 && lado2 != lado3) {
            System.out.println("Esse triangulo é um Escaleno...");

        } else {
            System.out.println("Esse triangulo é um Isósceles...");
        }
    }

    // Criação de um metodo para para verificar se o triangulo cadastrado é um triangulo retangulo ou não

    public void verificarTriangulo() {
        // Criação do cálculo do Teorema de Pitágoras

        if (Math.pow(lado2, 2) + Math.pow(lado3, 2) == Math.pow(base, 2)) {
            System.out.println("/*************************/");
            System.out.println("O Triangulo é retângulo.");
        } else {
            System.out.println("/*****************************/");
            System.out.println("O Triangulo não é retângulo.");
        }
    }

    // Criação de um metodo para verificar a proporcionalidade do triangulo retangulo 3, 4, 5

    public void verificarTriangulo345() {

        // Ordena os lados do triangulo cadastrado em ordem crescente para q sejam comparados corretamente

        double[] lados = {lado2, lado3, base};
        java.util.Arrays.sort(lados);

        double[] tri3_4_5 = {3, 4, 5};

        // Calcula qual a proporcionalidade do triangulo cadastrado com o triangulo 3, 4, 5

        double k1 = lados[0] / tri3_4_5[0];
        double k2 = lados[1] / tri3_4_5[1];
        double k3 = lados[2] / tri3_4_5[2];

        // Verifica se os triangulos sao proporcionais

        if (k1 == k2 && k2 == k3) {
            System.out.println("O Triangulo é proporcional ao Triangulo 3, 4, 5.");
        } else {
            System.out.println("O Triangulo não é proporcional ao Triangulo 3, 4, 5.");
        }
    }


}
