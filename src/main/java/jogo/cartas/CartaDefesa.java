package main.java.jogo.cartas;

import main.java.jogo.modelo.Jogador;

// CORREÇÃO: Removido o "abstract"
public class CartaDefesa extends Carta {

    public CartaDefesa(String nome, int poder) {
        super(nome, poder, 0);
    }

    @Override
    public void jogar(Jogador jogadorDaVez, Jogador jogadorAtacado) {
        System.out.println(jogadorDaVez.getNome() + " usa " + this.getNome() + " para se defender "
            + " (Poder: " + this.getPoder() + ")");

        // CORREÇÃO: 
        // 1. Usa o método defender() da interface Jogavel.
        // 2. O alvo é "jogadorDaVez" (quem joga a carta), conforme sugere o requisito.
        jogadorDaVez.defender(this.getPoder());

        // Incrementa as cartas jogadas
        this.cartasJogadas++;
        System.out.println("Cartas jogadas: " + this.getCartasJogadas());
    }
}