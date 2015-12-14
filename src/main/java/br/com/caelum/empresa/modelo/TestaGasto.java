package br.com.caelum.empresa.modelo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class TestaGasto {

	public static void main(String[] args) {

		Calendar dataNascimento = new GregorianCalendar(1986, 9, 30);
		Funcionario funcionario = new Funcionario("Leme", 9, dataNascimento);

		Calendar dataHoje = Calendar.getInstance();

		Gasto gasto = new Gasto(1000, "transporte", funcionario, dataHoje);
		Gasto gasto2 = new Gasto(1001, "transporte1", funcionario, dataHoje);
		Gasto gasto3 = new Gasto(1002, "transporte2", funcionario, dataHoje);
		
		List<Gasto>listaGastos = new ArrayList<Gasto>();
		
		//Testando Template - forprint
		for (Gasto gasto4 : listaGastos) {
			System.out.println(gasto4);
		}
		
		//System.out.println(gasto);
		//
		// Ctrl + Alt + seta baixa copia e cola

	}
}
