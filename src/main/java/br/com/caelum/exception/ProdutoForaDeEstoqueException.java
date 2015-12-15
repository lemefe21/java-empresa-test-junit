package br.com.caelum.exception;

import br.com.caelum.empresa.modelo.Produto;

//tira o warning no Errors/Warnins
public class ProdutoForaDeEstoqueException extends RuntimeException{

	public ProdutoForaDeEstoqueException(Produto produto){
		super("Não há estoque para o produto " + produto.getNome());
	}

}
