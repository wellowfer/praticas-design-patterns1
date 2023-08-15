package br.com.estudos.strategy.chainofresponsibility.desconto;

import br.com.estudos.strategy.chainofresponsibility.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoMaiorQueCincoItens extends Desconto{

    public DescontoMaiorQueCincoItens(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento) {
        if (orcamento.getQuantidadeItens() > 5) {
            return orcamento.getValor().multiply(new BigDecimal("0.05"));
        }

        return proximo.calcular(orcamento);
    }
}
