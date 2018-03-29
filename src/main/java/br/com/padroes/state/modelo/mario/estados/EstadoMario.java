/**
 * @author Luan Bukowitz Beluzzo
 *
 */
package br.com.padroes.state.modelo.mario.estados;

public interface EstadoMario {
	
	EstadoMario pegarFlor();
	
	EstadoMario pegarCogumelo();
	
	EstadoMario pegarPena();
	
	EstadoMario levarDano();

}
