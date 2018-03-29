/**
 * @author Luan Bukowitz Beluzzo
 *
 */
package br.com.padroes.state.modelo.personagens;

import br.com.padroes.state.modelo.mario.estados.EstadoMario;
import br.com.padroes.state.modelo.mario.estados.MarioPequeno;

public class Mario {

	private EstadoMario estado;

	public Mario() {
		this.estado = new MarioPequeno();
	}

	public void pegarFlor() {
		final EstadoMario estado = this.estado.pegarFlor();

		atualizarEstado(estado);
	}

	public void pegarCogumelo() {
		final EstadoMario estado = this.estado.pegarCogumelo();

		atualizarEstado(estado);
	}

	public void pegarPena() {
		final EstadoMario estado = this.estado.pegarPena();

		atualizarEstado(estado);
	}

	public void levarDano() {
		final EstadoMario estado = this.estado.levarDano();

		atualizarEstado(estado);
	}

	private void atualizarEstado(EstadoMario novoEstado) {
		this.estado = novoEstado;
	}

}
