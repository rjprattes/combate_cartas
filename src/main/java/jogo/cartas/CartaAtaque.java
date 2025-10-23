package main.java.jogo.cartas;

import main.java.jogo.modelo.Jogador;

public abstract class CartaAtaque extends Carta {

    public CartaAtaque(String nome, int poder) {
        // Chamando o construtor da classe mãe (Carta)
        super(nome, poder, 0); // Inicializa com 0 cartas jogadas por padrão
    }

    @Override
    public void jogar(Jogador jogadorDaVez, Jogador jogadorAtacado) {
        // Calcula o dano levando em consideração a defesa do jogador atacado
        int poderDeAtaque = this.getPoder();
        int defesaDoAtacado = jogadorAtacado.getDefesa();

        // O dano é o poder da carta menos a defesa do jogador atacado
        int dano = poderDeAtaque - defesaDoAtacado;

        // Se o dano for negativo, considera como 0
        if (dano < 0) {
            dano = 0;
        }

        // O jogador atacado perde vida com base no dano
        jogadorAtacado.setVida(jogadorAtacado.getVida() - dano);

        // Incrementa as cartas jogadas
        this.cartasJogadas++;

        // Exibe uma mensagem detalhada sobre o ataque
        System.out.println(jogadorDaVez.getNome() + " atacou " + jogadorAtacado.getNome() + " com " 
            + this.getNome() + " (poder " + poderDeAtaque + ")");
        System.out.println("Defesa do atacado: " + defesaDoAtacado + ", Dano causado: " + dano);
        System.out.println("Vida de " + jogadorAtacado.getNome() + " após o ataque: " + jogadorAtacado.getVida());
        System.out.println("Cartas jogadas: " + this.getCartasJogadas());
    }
}
