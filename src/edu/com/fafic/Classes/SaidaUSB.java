package edu.com.fafic.Classes;

import edu.com.fafic.Interfaces.Saida;

public class SaidaUSB implements Saida<EntradaUSB> {

	@Override
	public String conecta(EntradaUSB conexao) {
		// TODO Auto-generated method stub
		return conexao.conectado() + getNomeConexao();
	}

	@Override
	public String getNomeConexao() {
		// TODO Auto-generated method stub
		return "  entrada  USB";
	}
}
