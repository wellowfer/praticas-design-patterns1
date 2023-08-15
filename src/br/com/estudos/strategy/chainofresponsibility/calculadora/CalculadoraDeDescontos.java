package br.com.estudos.strategy.chainofresponsibility.calculadora;

import br.com.estudos.strategy.chainofresponsibility.desconto.Desconto;
import br.com.estudos.strategy.chainofresponsibility.desconto.DescontoMaiorQueCincoItens;
import br.com.estudos.strategy.chainofresponsibility.desconto.DescontoValorCompraMaiorQueQuinhentos;
import br.com.estudos.strategy.chainofresponsibility.desconto.SemDesconto;
import br.com.estudos.strategy.chainofresponsibility.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {


    public BigDecimal calcular(Orcamento orcamento ) {
        Desconto desconto = new DescontoMaiorQueCincoItens(
                new DescontoValorCompraMaiorQueQuinhentos(
                        new SemDesconto()));

        return desconto.calcular(orcamento);
    }
}
