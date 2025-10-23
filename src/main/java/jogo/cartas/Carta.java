package main.java.jogo.cartas;

import main.java.jogo.modelo.Jogador;

public abstract class Carta {
	private String nome;
	private int poder;
	int cartasJogadas;
	
	public Carta(String nome, int poder, int cartasJogadas) {
		super();
		this.nome = nome;
		this.poder = poder;
		this.cartasJogadas = cartasJogadas;
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
	

	public void jogar(Jogador jogadorDaVez, Jogador jogadorAtacado) {
		// TODO Stub de método gerado automaticamente
		
	}

}