package br.com.caelum.exception;

import br.com.caelum.empresa.modelo.Produto;

//tira o warning no Errors/Warnins
public class ProdutoForaDeEstoqueException extends RuntimeException{

	public ProdutoForaDeEstoqueException(Produto produto){
		super("N�o h� estoque para o produto " + produto.getNome());
	}

}
