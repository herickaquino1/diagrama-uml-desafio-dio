package edu.dio.desafio;

import java.util.ArrayList;

public class Telefone {
	public ArrayList<Contato> listaContatos;
	
	
	public void selecionarContato(int numero) {
		ligar(numero);
	}
	
	private void ligar(int numero) {
		for(Contato c:listaContatos) {
			if(c.getNumero() == numero) {
				System.out.println("Ligando para "+ c.getNome());
				break;
			}
		}
	}
	public void atender() {
		System.out.println("Atendendo.... ");
	}
	public void correioDeVoz() {
		System.out.println("Correio de voz");
	}
}
