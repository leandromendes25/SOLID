package br.com.alura.tdd.service;

import java.math.BigDecimal;
import java.util.List;

import br.com.alura.tdd.model.Funcionario;

public class ReajusteService {
	//Não criar varias validações, só colocar o construtor
	private List<ValidacaoReajuste> validacoes;
	
	public ReajusteService(List<ValidacaoReajuste> validacoes) {
		this.validacoes = validacoes;
	}

	public void reajutarSalarioDoFuncionario(Funcionario funcionario, BigDecimal aumento) {
		this.validacoes.forEach(v -> v.validar(funcionario, aumento));
		BigDecimal salarioReajustado = funcionario.getSalario().add(aumento);
		funcionario.atualizarSalario(salarioReajustado);
	}
}
