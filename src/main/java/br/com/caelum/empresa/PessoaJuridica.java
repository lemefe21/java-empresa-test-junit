package br.com.caelum.empresa;

public class PessoaJuridica extends DadosPessoais{

	private DadosPessoais dadosPessoais;
	
	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

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

	public String toString() {
		return dadosPessoais.toString();
	}
	
}
