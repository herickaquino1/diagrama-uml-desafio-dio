package edu.dio.desafio;

public class Musica {
	 private String cantor;
	 private String musica;
	 private int duracao;
	 
	public Musica(String cantor, String musica, int duracao) {
		super();
		this.cantor = cantor;
		this.musica = musica;
		this.duracao = duracao;
	}

	public String getCantor() {
		return cantor;
	}

	public void setCantor(String cantor) {
		this.cantor = cantor;
	}

	public String getMusica() {
		return musica;
	}

	public void setMusica(String musica) {
		this.musica = musica;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	
	 
	 
}
