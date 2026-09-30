package com.senai;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class CalculadoraTest {
    // Anotação para dizer que é uma função de teste
   @Test 
   void testarSoma(){
    Calculadora calculadora = new Calculadora();
    int resultado = calculadora.somar(3, 2);

    // metodo assert Equals compara o resultado que esperamos com o resultado
   assertEquals(5, resultado);
    }

    // Função de teste para multiplicação
    @Test
    void testarMult(){
        Calculadora calc = new Calculadora();
        int res = calc.multiplicacao(3,2);
        assertEquals(6, res);
    }
}
