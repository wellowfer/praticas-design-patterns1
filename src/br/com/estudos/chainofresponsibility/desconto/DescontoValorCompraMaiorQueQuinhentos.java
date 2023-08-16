package br.com.estudos.chainofresponsibility.desconto;

import br.com.estudos.chainofresponsibility.orcamento.Orcamento;
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
