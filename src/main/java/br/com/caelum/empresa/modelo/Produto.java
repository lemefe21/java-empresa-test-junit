package br.com.caelum.empresa.modelo;


public class Produto {

	private String nome;

	public Produto(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {

		//new Date(2014, 10, 1); deprecated - for�amos o erro de compila��o
		return nome;
	}

	public void setNome(String nome) {
		String s = "nome";
		s.codePointBefore(1);
		this.nome = nome;
	}

}
