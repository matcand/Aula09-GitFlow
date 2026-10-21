package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void deveDividirCorretamente() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.divide(10, 2));
    }

    @Test
    void deveLancarExcecaoAoDividirPorZero() {
        Calculadora calc = new Calculadora();
        ArithmeticException ex = assertThrows(ArithmeticException.class, () -> calc.divide(10, 0));
        assertEquals("Divisor não pode ser zero", ex.getMessage());
    }
}