package br.com.estudos.strategy.chainofresponsibility.desconto;

import br.com.estudos.strategy.chainofresponsibility.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoValorCompraMaiorQueQuinhentos extends Desconto{

    public DescontoValorCompraMaiorQueQuinhentos(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento) {
        if (orcamento.getValor().compareTo(new BigDecimal("500")) > 0) {
            return orcamento.getValor().multiply(new BigDecimal("0.10"));
        }

        return proximo.calcular(orcamento);
    }
}
