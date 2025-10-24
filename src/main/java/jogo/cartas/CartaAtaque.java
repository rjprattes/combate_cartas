package main.java.jogo.cartas;

import main.java.jogo.modelo.Jogador;

// CORREÇÃO: Removido o "abstract"
public class CartaAtaque extends Carta {

    public CartaAtaque(String nome, int poder) {
        super(nome, poder, 0); 
    }

    @Override
    public void jogar(Jogador jogadorDaVez, Jogador jogadorAtacado) {
        System.out.println(jogadorDaVez.getNome() + " ataca " + jogadorAtacado.getNome() + " com " 
            + this.getNome() + " (Poder: " + this.getPoder() + ")");

        // CORREÇÃO: Usa o método atacar() da interface Jogavel
        // A lógica de reduzir defesa, vida, etc., está DENTRO do método atacar()
        jogadorAtacado.atacar(this.getPoder());

        // Incrementa cartas jogadas
        this.cartasJogadas++;
        System.out.println("Cartas jogadas: " + this.getCartasJogadas());
    }
}