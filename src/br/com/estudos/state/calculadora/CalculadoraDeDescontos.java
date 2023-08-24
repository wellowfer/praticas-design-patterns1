package br.com.estudos.state.calculadora;

import br.com.estudos.state.desconto.Desconto;
import br.com.estudos.state.desconto.DescontoMaiorQueCincoItens;
import br.com.estudos.state.desconto.DescontoValorCompraMaiorQueQuinhentos;
import br.com.estudos.state.desconto.SemDesconto;
import br.com.estudos.state.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {


    public BigDecimal calcular(Orcamento orcamento ) {
        Desconto cadeiaDeDescontos = new DescontoMaiorQueCincoItens(
                new DescontoValorCompraMaiorQueQuinhentos(
                        new SemDesconto()));

        return cadeiaDeDescontos.calcular(orcamento);
    }
}
