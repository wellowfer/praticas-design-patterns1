package br.com.estudos.chainofresponsibility.orcamento;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valor;

    private Long quantidadeItens;

    public Orcamento(BigDecimal valor, Long quantidadeItens) {
        this.valor = valor;
        this.quantidadeItens = quantidadeItens;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Long getQuantidadeItens() {
        return quantidadeItens;
    }

    public void setQuantidadeItens(Long quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
    }
}
