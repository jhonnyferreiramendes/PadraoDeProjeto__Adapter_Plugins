package edu.com.fafic.Classes;

import edu.com.fafic.Interfaces.Conexao;

public class EntradaUSB implements Conexao {

	@Override
	public String conectado() {
		// TODO Auto-generated method stub
		return "Conexao do cabo USB conectada a: ";
	}

}
