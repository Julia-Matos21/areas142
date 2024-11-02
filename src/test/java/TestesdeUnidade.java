//pacote 

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import com.areas142.Main;

// classe 
public class TestesdeUnidade {
    
   // funções e métodos 
    @Test
    public void testCalcularAreaQuadrado() {
        double lado = 4;
        double resultadoEsperado = 16; // 4 * 4
        double resultadoAtual = Main.calcularAreaQuadrado(lado); // Deve retornar double
        assertEquals(resultadoEsperado, resultadoAtual);
    }

    @Test
    public void testCalcularAreaRetangulo() {
        double largura = 5;
        double altura = 3;
        double resultadoEsperado = 15; // 5 * 3
        double resultadoAtual = Main.calcularAreaRetangulo(largura, altura);
        assertEquals(resultadoEsperado, resultadoAtual);
    }

    @Test
    public void testCalcularAreaCirculo() {
        double raio = 2;
        double resultadoEsperado = Math.PI * raio * raio; // π * 2^2
        double resultadoAtual = Main.calcularAreaCirculo(raio);
        assertEquals(resultadoEsperado, resultadoAtual);
    }


    @Test
    public void testCalcularAreaTriangulo() {
        double base = 6;
        double altura = 4;
        double resultadoEsperado = (base * altura) / 2; // (6 * 4) / 2
        double resultadoAtual = Main.calcularAreaTriangulo(base, altura);
        assertEquals(resultadoEsperado, resultadoAtual);
    }

    // DDT: Data Driven Testing --> Teste Direcionado à Dados 
    // Popular: Teste com massa 

    @ParameterizedTest
    @CsvSource(value = {
        // Criando um teste de unidade data-drive para a função de calculo do retangulo
        "5, 3, 15",
        "6, 6, 36",
        "7, 9, 63"
    }, delimiter = ',')
    public void testCalcularAreaRetanguloDDT(double largura, double altura, double resultadoEsperado) {
        
        // Os dados de entrada e o resultado esperado são lidos da massa de testes acima
        double resultadoAtual = Main.calcularAreaRetangulo(largura, altura);
        assertEquals(resultadoEsperado, resultadoAtual);
    }

    // CSV
    @ParameterizedTest
    @CsvFileSource(resources = "csv/CalculodoTriangulo.csv", numLinesToSkip = 1, delimiter = ',' )

    public void testCalcularAreaRetanguloCSV(double largura, double altura, double resultadoEsperado) {
        
        // Os dados de entrada e o resultado esperado são lidos da massa de testes acima
        double resultadoAtual = Main.calcularAreaRetangulo(largura, altura);
        assertEquals(resultadoEsperado, resultadoAtual);
    }

}
