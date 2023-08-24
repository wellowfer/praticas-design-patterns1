package br.com.estudos.state.orcamento.situacao;

import br.com.estudos.state.exceptions.GenericException;
import br.com.estudos.state.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class SituacaoOrcamento {

    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

    public void aprovar(Orcamento orcamento) {
        throw new GenericException("Não é possível aprovar o orçamento.");
    }

    public void reprovar(Orcamento orcamento) {
        throw new GenericException("Não é possível reprovar o orçamento.");
    }

    public void finalizar(Orcamento orcamento) {
        throw new GenericException("Não é possível finalizar o orçamento.");
    }
}
