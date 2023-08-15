package br.com.estudos.strategy.strategy.imposto;

import br.com.estudos.strategy.strategy.orcamento.Orcamento;

import java.math.BigDecimal;

public class Irpf implements Imposto {

    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.07"));
    }
}
