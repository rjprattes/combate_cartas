package main.java.jogo.modelo;

public interface Jogavel {

    void atacar(int poder);

    void defender(int poder);

    boolean estaVivo();
}