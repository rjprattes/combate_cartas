package main.java.jogo.modelo;

public class Jogador implements Jogavel {
	private String nome;
	private int vida = 2;
	private int defesa = 50;
	
	public Jogador(String nome, int vida, int defesa) {
		super();
		this.nome = nome;
		this.vida = vida;
		this.defesa = defesa;
	}
	public Jogador() {
	}


	public String getNome() {
		return nome;
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
            this.vida -= 1; // Perde 1 ponto de vida
            this.defesa += 100; // Defesa é aumentada em +100
        }
    }

    @Override
    public void defender(int poder) {
        System.out.println("Jogador defendendo " + poder + " pontos.");
        this.defesa += poder;
    }

    @Override
    public boolean estaVivo() {
        return this.vida > 0 && this.defesa > 0;
    }

    public void status() {
        System.out.println("STATUS: [Vida: " + this.vida + ", Defesa: " + this.defesa + "]");
    }
	public void setVida(int i) {
		// TODO Stub de método gerado automaticamente
		
	}
	public void setDefesa(int i) {
		// TODO Stub de método gerado automaticamente
		
	}
}