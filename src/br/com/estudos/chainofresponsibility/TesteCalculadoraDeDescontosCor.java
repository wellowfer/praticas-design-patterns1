package br.com.estudos.chainofresponsibility;

import br.com.estudos.chainofresponsibility.calculadora.CalculadoraDeDescontos;
import br.com.estudos.chainofresponsibility.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteCalculadoraDeDescontosCor {

    public static void main(String[] args) {

        final String MSG_DESCONTO_APLICADO = " Desconto aplicado: ";

        Orcamento orcamento = new Orcamento(new BigDecimal("1200"), 5L);
        Orcamento orcamento2 = new Orcamento(new BigDecimal("600"), 6L);
        Orcamento orcamento3 = new Orcamento(new BigDecimal("150"), 2L);
        CalculadoraDeDescontos calculadoraDeDescontos = new CalculadoraDeDescontos();
        System.out.println("Desconto esperado de 10% em cima do: R$ " + orcamento.getValor() + MSG_DESCONTO_APLICADO + calculadoraDeDescontos.calcular(orcamento));
        System.out.println("Desconto esperado de 5% em cima do: R$ " + orcamento2.getValor() + MSG_DESCONTO_APLICADO + calculadoraDeDescontos.calcular(orcamento2));
        System.out.println("Desconto esperado de 0% em cima do: R$ " + orcamento3.getValor() + MSG_DESCONTO_APLICADO + calculadoraDeDescontos.calcular(orcamento3));

    }
}
