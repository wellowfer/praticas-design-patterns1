package br.com.estudos.strategy.strategy;

import br.com.estudos.strategy.strategy.calculadora.CalculadoraImposto;
import br.com.estudos.strategy.strategy.imposto.Icms;
import br.com.estudos.strategy.strategy.imposto.Ipi;
import br.com.estudos.strategy.strategy.imposto.Irpf;
import br.com.estudos.strategy.strategy.imposto.Iss;
import br.com.estudos.strategy.strategy.orcamento.Orcamento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class TesteCalculadoraImpostosStrategy {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("1000"));
        List<Orcamento> orcamentos = new ArrayList<>();
        orcamentos.add(new Orcamento(new BigDecimal("1000")));
        orcamentos.add(new Orcamento(new BigDecimal("1000")));
        orcamentos.add(new Orcamento(new BigDecimal("1000")));
        CalculadoraImposto calculadoraImposto = new CalculadoraImposto();
        System.out.println("Cálculo ICMS: ".concat(String.valueOf(calculadoraImposto.calcular(orcamento, new Icms()))));
        System.out.println("Cálculo ISS: ".concat(String.valueOf(calculadoraImposto.calcular(orcamento, new Iss()))));
        System.out.println("Cálculo IRPF: ".concat(String.valueOf(calculadoraImposto.calcular(orcamento, new Irpf()))));
        System.out.println("Cálculo IPI: ".concat(String.valueOf(calculadoraImposto.calcular(orcamento, new Ipi()))));

        orcamentos.forEach(orcamento1 -> System.out.println("TESTE 3: " + calculadoraImposto.calcular(orcamento1,new Ipi())));

    }
}
