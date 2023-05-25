package br.com.streaming.util;
import br.com.streaming.classes.Midias;

public class MostraMidia {
	
	
	public void mostraMidia(Midias mostra) {
		System.out.println("Título da Faixa: " + mostra.getTitulo());
		System.out.println("Autor da Faixa: " + mostra.getAutor());
		System.out.println("Tempo da Faixa: " + mostra.getTempoEmMin());
		
		if(mostra.isConvidadoAtivo() == true) {
			System.out.println("Convidado: " + mostra.getConvidado());
		}
	}
	
}
