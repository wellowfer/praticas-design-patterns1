package br.com.estudos.strategy.imposto;

import br.com.estudos.strategy.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {

    BigDecimal calcular(Orcamento orcamento);
}
