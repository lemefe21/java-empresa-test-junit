package br.com.caelum.empresa.dao;

import org.apache.log4j.Logger;

import br.com.caelum.empresa.modelo.Funcionario;

public class FuncionarioDAO extends DAO<Funcionario> {

	public FuncionarioDAO() {
		super(Funcionario.class);
	}
	
	//Utilizando template - looger2
	/**
	 * Logger para auditoria da classse FuncionarioDAO
	 * @author Leme
	 */
	private static final Logger logger = Logger.getLogger(FuncionarioDAO.class);

}
