/**
 * @author Luan Bukowitz Beluzzo
 *
 */
package br.com.padroes.state.modelo.mario.estados;

public class MarioComCapa implements EstadoMario {

	@Override
	public EstadoMario pegarFlor() {

		System.out.println("Ganhou 1000 pontos");

		return new MarioFogo();
	}

	@Override
	public EstadoMario pegarCogumelo() {

		System.out.println("Ganhou 1000 pontos");

		return this;
	}

	@Override
	public EstadoMario pegarPena() {

		System.out.println("Ganhou 1000 pontos");

		return this;
	}

	@Override
	public EstadoMario levarDano() {
		
		System.out.println("Mario Grande");
		
		return new MarioGrande();
	}

}
