package br.com.estudos.strategy.imposto;

import br.com.estudos.strategy.orcamento.Orcamento;

import java.math.BigDecimal;

public class Ipi implements Imposto {

    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }
}
