// 1 - Bibliotecas / Imports
 
// 1.5 - Pacotes
package com.areas142; // pacote 

// 2 - Classe 
public class Main {

// 2.1 Atributos
 
    // 2.2 Métodos e Funções
    public static void main(String[] args) {
        System.out.println("Olá Mundo!");

    }

    // Função para calcular a área de um quadrado
    public static double calcularAreaQuadrado(double lado) {
        return lado * lado;
    }

    // Função para calcular a área de um retângulo
    public static double calcularAreaRetangulo(double largura, double altura) {
        return largura * altura;
    }

    // Função para calcular a área de um círculo
    public static double calcularAreaCirculo(double raio) {
        return Math.PI * raio * raio;
    }

    // Função para calcular a área de um triângulo
    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

}