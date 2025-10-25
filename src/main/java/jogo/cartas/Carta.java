package main.java.jogo.cartas;

import main.java.jogo.modelo.Jogador;

public abstract class Carta {
	protected String nome;
	protected int poder;
	protected static int cartasJogadas = 0;
	
	public Carta(String nome, int poder) {
		this.nome = nome;
		this.poder = poder;
	}

	public String getNome() {
		return nome;
	}

	public int getPoder() {
		return poder;
	}

	public int getCartasJogadas() {
		return cartasJogadas;
	}

	@Override
	public String toString() {
		return "carta [nome=" + nome + ", poder=" + poder + ", cartasJogadas=" + cartasJogadas + "]";
	}
	
	public abstract void jogar(Jogador jogadorDaVez, Jogador jogadorAtacado); {
		// TODO Stub de método gerado automaticamente
		
	}


}
