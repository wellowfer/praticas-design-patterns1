package br.com.estudos.chainofresponsibility.desconto;

import br.com.estudos.chainofresponsibility.orcamento.Orcamento;
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
