package br.com.padroes.state.app;

import br.com.padroes.state.modelo.personagens.Mario;

/**
 * Fonte: https://www.youtube.com/watch?v=Ekq5DTUDpaQ
 * */
public class App {

	public static void main(String[] args) {
		
		final Mario mario = new Mario();
		
		mario.pegarCogumelo();
		mario.pegarFlor();
		mario.levarDano();
		mario.pegarPena();
		mario.levarDano();
		mario.levarDano();
		mario.pegarCogumelo();
		mario.levarDano();
		mario.levarDano();
		mario.levarDano();

	}

}
