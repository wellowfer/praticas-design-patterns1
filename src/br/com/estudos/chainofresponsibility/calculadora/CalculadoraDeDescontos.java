package br.com.estudos.chainofresponsibility.calculadora;

import br.com.estudos.chainofresponsibility.desconto.Desconto;
import br.com.estudos.chainofresponsibility.desconto.DescontoMaiorQueCincoItens;
import br.com.estudos.chainofresponsibility.desconto.DescontoValorCompraMaiorQueQuinhentos;
import br.com.estudos.chainofresponsibility.desconto.SemDesconto;
import br.com.estudos.chainofresponsibility.orcamento.Orcamento;
import java.math.BigDecimal;

public class CalculadoraDeDescontos {


    public BigDecimal calcular(Orcamento orcamento ) {
        Desconto cadeiaDeDescontos = new DescontoMaiorQueCincoItens(
                new DescontoValorCompraMaiorQueQuinhentos(
                        new SemDesconto()));

        return cadeiaDeDescontos.calcular(orcamento);
    }
}
