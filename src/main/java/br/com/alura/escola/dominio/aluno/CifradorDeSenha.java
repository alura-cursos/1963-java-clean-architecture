package br.com.alura.escola.dominio.aluno;

public interface CifradorDeSenha {

	String cifrarSenha(String senha);
	
	boolean validarSenhaCifrada(String senhaCifrada, String senha);
}
