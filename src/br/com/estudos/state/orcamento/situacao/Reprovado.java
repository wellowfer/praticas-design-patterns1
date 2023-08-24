package br.com.estudos.state.orcamento.situacao;

import br.com.estudos.state.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento {

    @Override
    public void reprovar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }
}
