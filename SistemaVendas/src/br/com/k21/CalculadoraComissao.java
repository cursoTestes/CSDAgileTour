package br.com.k21;

public class CalculadoraComissao {

	private static final int faixa_LIMITE = 10000;

	public Double comissao(Double valorDaVenda) {
		Double comissao = 0.0;
        if( valorDaVenda <= faixa_LIMITE )
        	comissao = valorDaVenda * 0.05;
        else
        	comissao = valorDaVenda * 0.06;
		return comissao;
	}

}
