package edu.dio.desafio;

import java.util.ArrayList;

public class ReprodutorMusical {
	public ArrayList<Musica> listaMusicas;

	public void selecionarMusica(String nomeMusica) {
		tocar(nomeMusica);
	}
	
	private void tocar(String nomeMusica) {
		for(Musica m:listaMusicas) {
			if(m.getMusica().equals(nomeMusica)) {
				System.out.println("Tocando!");
				System.out.println(m.getMusica());
				System.out.println(m.getCantor());
				System.out.println(m.getDuracao());
				break;
			}else {
				System.out.println("Midia não encontrada!!");
			}
		}
	}
	
	public void pausar() {
		System.out.println("Musica pausada!!"); 
	}
	
	
}
