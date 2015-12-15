package br.com.caelum.empresa.leitor;

//junit.Assert é utilizado para verificar os resultados dos test
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.text.ParseException;
import java.util.Collection;

import org.junit.Test;

import br.com.caelum.empresa.modelo.Gasto;

/**
 * @category Configurando o ambiente: acesso via
 * Save Action - personaliza os ajustes ao salvar
 * Clean Up - formatação personalizado
 * Errors/Warnins - personaliza os avisos de erro e warning, ou força
 * 		o lançamento de um erro de compilação por exemplo
 * Typing - ajuste para automatizar a inserção de {} e ;
 * Content Assit - ajuda a configuração para subtituir um metodo ao
 * 		digitar Crtl+Espaco alterando para Completion averwrite.
 * 		Em Insert best guessed arg ajuda a setar os parametros.
 * 		Em Type Filters sugerimos opções classes que não aparecerão
 * 		na lista como opção de imports.
 * Favorites - incluimos na lista de chamadas os métodos static
 * Keys - possibilita a criação de novos atalhos
 *
 * @author Leme
 *
 */

public class ImportadorTest {

	@Test
	public void deveRetornarUmaListaVaziaSeArquivoPassadoForVazio() throws ParseException {

		// criamos um arquivo vazio
		ByteArrayInputStream input = new ByteArrayInputStream(new byte[0]);

		// chamamos o importador de gastos
		ImportadorDeGastos importador = new ImportadorDeGastos();
		Collection<Gasto> gastos = importador.importa(input);

		// checamos se a lista está vazia

		assertTrue("A lista não está vazia", gastos.isEmpty());
	}

	@Test
	public void deveRetornarUmGastoDeUmArquivoNoFormatoCorreto() throws ParseException {

		// String com os dados de um gasto
		String conteudo = "CARTA001012011000010000123jbjasbd jbjbbb                22071983\r\n";

		// exemplo com erro na data
		// String conteudo =
		// "CARTA00x1012011000010000123jbjasbd jbjbbb                22071983\r\n";

		ByteArrayInputStream input = new ByteArrayInputStream(conteudo.getBytes());

		// chamamos o importador de gastos
		ImportadorDeGastos importador = new ImportadorDeGastos();
		Collection<Gasto> gastos = importador.importa(input);

		// no debug na variavel, Ctrl+Shift+d(2x) abre a aba Display, para
		// podermos trabalhar com a variavel

		// checamos se a lista está vazia
		assertEquals("Deveria conter um elemento!", 1, gastos.size());

	}

}
