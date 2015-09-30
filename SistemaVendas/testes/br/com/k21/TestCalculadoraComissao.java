package br.com.k21;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestCalculadoraComissao {
	
	@Test
	public void testarCalculoParaVenda1000reais() {
		//arrange
		Double esperado = 50.0;
		Double valorDaVenda = 1000.0;
		
		//act
		CalculadoraComissao calc = new CalculadoraComissao();
		Double resultadoObtido = calc.comissao(valorDaVenda);
		
		//assert
		assertEquals(esperado, resultadoObtido);
	}
	
	@Test
	public void testarCalculoParaVenda20000reais() {
		//arrange
		Double esperado = 1200.0;
		Double valorDaVenda = 20000.0;
		
		//act
		CalculadoraComissao calc = new CalculadoraComissao();
		Double resultadoObtido = calc.comissao(valorDaVenda);
		
		//assert
		assertEquals(esperado, resultadoObtido);
	}
}
