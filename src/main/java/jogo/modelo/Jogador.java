package main.java.jogo.modelo;

public class Jogador implements Jogavel {
	private String nome;
	private int vida = 2;
	private int defesa = 50;
	
	public Jogador(String nome) {
		super();
		this.nome = nome;
		this.vida = 2;
		this.defesa = 50;
	}
	public Jogador() {
	}


	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) { 
		this.nome = nome;
	}

	public int getVida() {
		return vida;
	}

	public int getDefesa() {
		return defesa;
	}

    @Override
    public void atacar(int poder) {
        System.out.println("Jogador recebeu " + poder + " de dano");
        this.defesa -= poder;

        if (this.defesa < 0) {
            System.out.println("Defesa quebrada!");
            this.vida -= 1; 
            this.defesa += 100; 
        }
    }

    @Override
    public void defender(int poder) {
        System.out.println("Jogador defendendo " + poder + " pontos.");
        this.defesa += poder;
    }

    @Override
    public boolean estaVivo() {
    	return this.vida > 0 || this.defesa > 0;
    }

    @Override
    public String toString() {
        return "O Jogador" + nome + "', Está com a vida= " + vida + ", E a defesa= " + defesa;
    }
}