package br.com.estudos.strategy.strategy.imposto;

import br.com.estudos.strategy.strategy.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {

    BigDecimal calcular(Orcamento orcamento);
}
