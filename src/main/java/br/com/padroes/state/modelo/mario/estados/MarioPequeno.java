/**
 * @author Luan Bukowitz Beluzzo
 *
 */
package br.com.padroes.state.modelo.mario.estados;

public class MarioPequeno implements EstadoMario {

	@Override
	public EstadoMario pegarFlor() {
		
		System.out.println("Mario em Chamas");
		
		return new MarioFogo();
	}

	@Override
	public EstadoMario pegarCogumelo() {
		
		System.out.println("Mario Grande");
		
		return new MarioGrande();
	}

	@Override
	public EstadoMario pegarPena() {
		
		System.out.println("Mario com Capa");
		
		return new MarioComCapa();
	}

	@Override
	public EstadoMario levarDano() {
		
		System.out.println("Mario morto - Game Over");
		
		return new MarioMorto();
	}

}
