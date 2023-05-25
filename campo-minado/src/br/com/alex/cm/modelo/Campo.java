package br.com.alex.cm.modelo;

public class Campo {
	
	private final int linha;
	private final int coluna;
	
	private boolean aberto = false;
	private boolean mionado = false;
	private boolean marcado = false;
	
	Campo(int linha, int coluna) {
		this.linha = linha;
		this.coluna = coluna;
	}

}
