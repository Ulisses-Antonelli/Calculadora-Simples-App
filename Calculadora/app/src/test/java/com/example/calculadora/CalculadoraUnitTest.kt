package com.example.calculadora

import org.junit.Test
import org.junit.Assert.*

class CalculadoraUnitTest {

    private val calc = Calculadora()

    @Test
    fun testSomar() {
        val resultado = calc.add(2, 3)
        assertEquals(5, resultado)
    }

    @Test
    fun testeAdicionarComNumerosNegativos() {
        val resultado = calc.add(-2, -3)
        assertEquals(-5, resultado)
    }

    @Test
    fun testAdicionarComZero() {
        val resultado = calc.add(0, 0)
        assertEquals(0, resultado)
    }

    @Test
    fun testAdicionarComNumerosGrandes() {
        val resultado = calc.add(1000000, 2000000)
        assertEquals(3000000, resultado)
    }
}