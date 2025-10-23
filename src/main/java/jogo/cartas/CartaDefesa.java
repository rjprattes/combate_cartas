package main.java.jogo.cartas;

import main.java.jogo.modelo.Jogador;

public abstract class CartaDefesa extends Carta {

    public CartaDefesa(String nome, int poder) {
        // Chamando o construtor da classe mãe (Carta)
        super(nome, poder, 0); // Inicializa com 0 cartas jogadas por padrão
    }

    @Override
    public void jogar(Jogador jogadorDaVez, Jogador jogadorAtacado) {
        // Aumenta a defesa do jogador atacado com o poder da carta
        int poderDeDefesa = this.getPoder();
        
        // A defesa do jogador é aumentada pelo poder da carta
        jogadorAtacado.setDefesa(jogadorAtacado.getDefesa() + poderDeDefesa);

        // Incrementa as cartas jogadas
        this.cartasJogadas++;

        // Exibe uma mensagem detalhada sobre o efeito da carta de defesa
        System.out.println(jogadorDaVez.getNome() + " usou " + this.getNome() + " para aumentar a defesa de " 
            + jogadorAtacado.getNome() + " em " + poderDeDefesa);
        System.out.println("Nova defesa de " + jogadorAtacado.getNome() + ": " + jogadorAtacado.getDefesa());
        System.out.println("Cartas jogadas: " + this.getCartasJogadas());
    }
}
