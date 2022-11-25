package edu.com.fafic.Classes;

import edu.com.fafic.Interfaces.Saida;

public class SaidaPS2 implements Saida <EntradaPS2> {

	@Override
	public String conecta(EntradaPS2 conexao) {
		// TODO Auto-generated method stub
		return conexao.conectado() + getNomeConexao();
	}

	@Override
	public String getNomeConexao() {
		// TODO Auto-generated method stub
		return " entrada  PS2";
	}


}
