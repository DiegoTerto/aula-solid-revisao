package br.edu.unicesumar.service;

import br.edu.unicesumar.domain.CLT;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.*;

class CalcularRemuneracaoServiceTest {

    @Test
    void deveCalcularRemuneracaoParaFuncioinarioCLT() {
        // arrange
        DecimalFormat formato = new DecimalFormat("#.00");
        CalcularRemuneracaoService calcularRemuneracaoService = new CalcularRemuneracaoService(
                new CLT("Lumbrigo", new BigDecimal("1000.00"), new BigDecimal("100.00"))
        );
        // act
        BigDecimal remuneracao = calcularRemuneracaoService.calcular();
        // assert
        assertEquals("1050,00", formato.format(remuneracao));
    }
}