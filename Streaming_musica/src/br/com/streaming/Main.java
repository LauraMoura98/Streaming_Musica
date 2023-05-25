package br.com.streaming;
import br.com.streaming.classes.Midias;
import br.com.streaming.classes.Musica;
import br.com.streaming.classes.Podcast;
import br.com.streaming.util.MostraMidia;
import br.com.streaming.util.CalcTempoTotal;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		ArrayList<Object> album = new ArrayList<>();
		Musica track1 = new Musica();
		Musica track2 = new Musica();
		Musica track3 = new Musica();		
		Podcast pod = new Podcast();
		MostraMidia mid = new MostraMidia();
		CalcTempoTotal calc = new CalcTempoTotal();
		
		track1.setTitulo("I AM");
		track1.setAutor("IVE");
		track1.setTempoEmMin(2.59);
		track1.setConvidadoAtivo(false);
		
		ArrayList<Object> trackFirst = new ArrayList<Object>();
		
		trackFirst.add(track1.getTitulo());
		trackFirst.add(track1.getAutor());
		trackFirst.add(track1.getTempoEmMin());
		album.add(trackFirst);
		
		track2.setTitulo("Unforgiven");
		track2.setAutor("LE SSERAFIM");
		track2.setTempoEmMin(3.05);
		track2.setConvidadoAtivo(true);
		track2.setConvidado("Destiny Rogers");
		
		ArrayList<Object> trackSecond = new ArrayList<Object>();
		
		trackSecond.add(track2.getTitulo());
		trackSecond.add(track2.getAutor());
		trackSecond.add(track2.getTempoEmMin());
		trackSecond.add(track2.getConvidado());
		album.add(trackSecond);
		
		track3.setTitulo("Kitsch");
		track3.setAutor("IVE");
		track3.setTempoEmMin(2.50);
		track3.setConvidadoAtivo(false);
		
		ArrayList<Object> trackThird = new ArrayList<Object>();
		
		trackThird.add(track3.getTitulo());
		trackThird.add(track3.getAutor());
		trackThird.add(track3.getTempoEmMin());
		album.add(trackThird);
		
		
		
		calc.incluiTempo(track1);
		calc.incluiTempo(track2);
		calc.incluiTempo(track3);
		
		mid.mostraMidia(track1);
		System.out.println("\n");
		mid.mostraMidia(track2);
		System.out.println("\n");
		mid.mostraMidia(track3);
		System.out.println("\n");
		System.out.println(calc.getTempoTotal());
		
	}

}
