/**
 * @author Luan Bukowitz Beluzzo
 *
 */
package br.com.padroes.state.modelo.mario.estados;

public class MarioMorto implements EstadoMario {

	@Override
	public EstadoMario pegarFlor() {
		return notificarMorte();
	}

	@Override
	public EstadoMario pegarCogumelo() {
		return notificarMorte();
	}

	@Override
	public EstadoMario pegarPena() {
		return notificarMorte();
	}

	@Override
	public EstadoMario levarDano() {
		return notificarMorte();
	}
	
	private EstadoMario notificarMorte(){
		
		System.out.println("Mario está morto!");
		
		return this;
	}

}
