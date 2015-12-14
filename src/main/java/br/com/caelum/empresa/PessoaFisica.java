package br.com.caelum.empresa;

public class PessoaFisica{
	
	private DadosPessoais dadosPessoais;
	
	private String cpf;

	public String getNome() {
		return dadosPessoais.getNome();
	}

	public void setNome(String nome) {
		dadosPessoais.setNome(nome);
	}

	public String getEndereco() {
		return dadosPessoais.getEndereco();
	}

	public void setEndereco(String endereco) {
		dadosPessoais.setEndereco(endereco);
	}

	public String getEmail() {
		return dadosPessoais.getEmail();
	}

	public void setEmail(String email) {
		dadosPessoais.setEmail(email);
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String toString() {
		return dadosPessoais.toString();
	}
	
}
