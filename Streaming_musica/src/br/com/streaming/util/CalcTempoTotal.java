package br.com.streaming.util;
import br.com.streaming.classes.Midias;

public class CalcTempoTotal {
	
	private double tempoTotal;
	
    public void incluiTempo(Midias t){
        this.tempoTotal += t.getTempoEmMin();

    }
	
	  public double getTempoTotal() {
		  System.out.println("Duração Total: ");
	        return tempoTotal;
	    }

}