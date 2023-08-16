package br.com.estudos.chainofresponsibility.desconto;

import br.com.estudos.chainofresponsibility.orcamento.Orcamento;
import java.math.BigDecimal;

public class SemDesconto extends Desconto {

    public SemDesconto() {
        super(null);
    }

    public BigDecimal efetuarDesconto(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

    @Override
    public Boolean deveAplicar(Orcamento orcamento) {
        return true;
    }
}
