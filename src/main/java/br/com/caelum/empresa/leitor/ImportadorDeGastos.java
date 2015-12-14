package br.com.caelum.empresa.leitor;

import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import br.com.caelum.empresa.modelo.Funcionario;
import br.com.caelum.empresa.modelo.Gasto;

public class ImportadorDeGastos {
	
	private SimpleDateFormat df = new SimpleDateFormat("ddMMyyyy");
	
	public Collection<Gasto> importa(InputStream entrada) throws ParseException {
		Scanner leitor = new Scanner(entrada);
		Set<Gasto> gastos = new LinkedHashSet<Gasto>();
	
		while (leitor.hasNextLine()) {
		
			String linha = leitor.nextLine();
			String gasto = linha.substring(0, 6);
			String data = linha.substring(6, 14);
			String valorLinha = linha.substring(14, 23);
			String matriculaLinha = linha.substring(23, 26);
			String nome = linha.substring(26, 56);
			String dataNascTxt = linha.substring(56);
			double valor = Double.parseDouble(valorLinha);
			int matricula = Integer.parseInt(matriculaLinha);
			Calendar dataNascimento = dataGerador(df, dataNascTxt);
			Calendar dataDespesa = dataGerador(df, data);
			Funcionario funcionario = new Funcionario(nome, matricula,
					dataNascimento);
			gastos.add(new Gasto(valor, gasto, funcionario, dataDespesa));
		}
		return gastos;
	}
	
	private Calendar dataGerador(SimpleDateFormat df, String dataNascTxt)
			throws ParseException {
		Calendar dataNascimento = Calendar.getInstance();
		dataNascimento.setTime(df.parse(dataNascTxt));
		return dataNascimento;
	}
}
