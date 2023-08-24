package br.com.estudos.state.desconto;

import br.com.estudos.state.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoMaiorQueCincoItens extends Desconto {

    public DescontoMaiorQueCincoItens(Desconto proximo) {
        super(proximo);
    }

    @Override
    public BigDecimal efetuarDesconto(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }

    @Override
    public Boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getQuantidadeItens() > 5;
    }
}
