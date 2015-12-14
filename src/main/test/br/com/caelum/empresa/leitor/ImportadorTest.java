package br.com.caelum.empresa.leitor;

//junit.Assert é utilizado para verificar os resultados dos test
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.text.ParseException;
import java.util.Collection;

import org.junit.Test;

import br.com.caelum.empresa.modelo.Gasto;

public class ImportadorTest {

	@Test
	public void deveRetornarUmaListaVaziaSeArquivoPassadoForVazio() throws ParseException {
		
		//criamos um arquivo vazio
		ByteArrayInputStream input = new ByteArrayInputStream(new byte[0]);
		
		//chamamos o importador de gastos
		ImportadorDeGastos importador = new ImportadorDeGastos();
		Collection<Gasto> gastos = importador.importa(input);
		
		//checamos se a lista está vazia
		assertTrue("A lista não está vazia", gastos.isEmpty());
		
	}
	
	@Test
	public void deveRetornarUmGastoDeUmArquivoNoFormatoCorreto() throws ParseException {
		
		//String com os dados de um gasto
		String conteudo = "CARTA001012011000010000123jbjasbd jbjbbb                22071983\r\n";
		
		//exemplo com erro na data
		//String conteudo = "CARTA00x1012011000010000123jbjasbd jbjbbb                22071983\r\n";
		
		ByteArrayInputStream input = new ByteArrayInputStream(conteudo.getBytes());
		
		//chamamos o importador de gastos
		ImportadorDeGastos importador = new ImportadorDeGastos();
		Collection<Gasto> gastos = importador.importa(input);
		
		//no debug na variavel, Ctrl+Shift+d(2x) abre a aba Display, para podermos trabalhar com a variavel
		
		//checamos se a lista está vazia
		assertEquals("Deveria conter um elemento!", 1, gastos.size());
		
	}

	
	
}
