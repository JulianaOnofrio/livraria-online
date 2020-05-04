package br.com.casadocodigo.loja.models;

import java.math.BigDecimal;

public class DadosPagamento {
	public DadosPagamento(BigDecimal value) {
		this.value = value;
	}
	public DadosPagamento() {
	}
	
	private BigDecimal value;

	public BigDecimal getValue() {
		return value;
	}
	
}
