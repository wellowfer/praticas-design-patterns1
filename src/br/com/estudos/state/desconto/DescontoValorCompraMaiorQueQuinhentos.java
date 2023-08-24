package br.com.estudos.state.desconto;

import br.com.estudos.state.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoValorCompraMaiorQueQuinhentos extends Desconto {

    public DescontoValorCompraMaiorQueQuinhentos(Desconto proximo) {
        super(proximo);
    }

    @Override
    public BigDecimal efetuarDesconto(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.10"));
    }

    @Override
    public Boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
    }
}
