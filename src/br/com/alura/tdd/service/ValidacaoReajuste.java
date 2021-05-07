package br.com.alura.tdd.service;

import java.math.BigDecimal;

import br.com.alura.tdd.model.Funcionario;

public interface ValidacaoReajuste {
void validar(Funcionario funcionario, BigDecimal aumento);

}
