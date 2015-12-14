package br.com.caelum.empresa;

import java.util.Calendar;
import java.util.GregorianCalendar;

import br.com.caelum.empresa.modelo.Funcionario;

public class Principal { // Ctrl + F6 altera entre editores

	public static void main(String[] args) {

		// Ctrl + M maximixa a tela principal

		Calendar dataNascimento = novoMetodo();
		Funcionario func = new Funcionario("Leme", 1234, dataNascimento);
		// Ctrl + . vai p proxima erro
		
		// variavel criada com o Shift + Alt + L
		Funcionario funcionario = new Funcionario("Eu", 5678, dataNascimento);

		System.out.println(func);

		// syserrX
		System.err.println("erro...");

		// systrace
		System.out.println("Principal.main()");

		// Ctrl + F11

		// Alt + shift + X opções para exec

	}

	private static Calendar novoMetodo() {
		Calendar dataNascimento = new GregorianCalendar(2015, 8, 9);
		return dataNascimento;
	}

}
