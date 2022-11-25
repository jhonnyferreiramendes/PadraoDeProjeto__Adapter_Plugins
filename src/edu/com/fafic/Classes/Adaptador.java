package edu.com.fafic.Classes;

public class Adaptador extends SaidaUSB {
	
	public String conecta(EntradaPS2 conexaoPS2){
        return conexaoPS2.conectado() + getNomeConexao();
    }

}
