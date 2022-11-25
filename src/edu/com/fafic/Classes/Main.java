package edu.com.fafic.Classes;

public class Main {

	public static void main(String[] args) {
		SaidaUSB su = new SaidaUSB();
	       EntradaPS2 cp = new EntradaPS2();
	       EntradaUSB cu = new EntradaUSB();
	       Adaptador adaptador = new Adaptador();

	       System.out.println(adaptador.conecta(cp));

	}

}
