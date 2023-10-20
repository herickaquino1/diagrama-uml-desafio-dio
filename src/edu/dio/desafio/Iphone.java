package edu.dio.desafio;

import java.util.ArrayList;

public class Iphone {

	public static void main(String[] args) {
		
		Musica m1 = new Musica("Luan Santana", "Eu você o mar e ela", 3);
		Musica m2 = new Musica("Projota", "Foco, força e fé", 4);
		Musica m3 = new Musica("Orrapa", "Reza a vela", 4);
		
		ReprodutorMusical ipad = new ReprodutorMusical();
		ipad.listaMusicas = new ArrayList<Musica>();
		ipad.listaMusicas.add(m1);
		ipad.listaMusicas.add(m2);
		ipad.listaMusicas.add(m3);
		ipad.selecionarMusica("Eu você o mar e ela");
		
		
		
		

	}

}
