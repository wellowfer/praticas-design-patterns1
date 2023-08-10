package br.com.estudos.strategy.calculadora;

import br.com.estudos.strategy.imposto.Imposto;
import br.com.estudos.strategy.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraImposto {

//    private List<Imposto> impostos;
//
//    public CalculadoraImposto(List<Imposto> impostos) {
//        this.impostos = impostos;
//    }
    public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
        return imposto.calcular(orcamento);
    }

//    public List<BigDecimal> calculos(Orcamento orcamento) {
//       return this.impostos.forEach(imposto -> imposto.calcular(orcamento));
//    }
}
