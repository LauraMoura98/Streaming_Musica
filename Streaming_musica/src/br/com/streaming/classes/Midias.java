package br.com.streaming.classes;
import java.util.ArrayList;

public class Midias {
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getConvidado() {
		return convidado;
	}
	public void setConvidado(String convidado) {
		this.convidado = convidado;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public ArrayList<Object> getColecao() {
		return colecao;
	}
	public void setColecao(ArrayList<Object> colecao) {
		this.colecao = colecao;
	}
	public double getTempoEmMin() {
		return tempoEmMin;
	}
	public void setTempoEmMin(double tempoEmMin) {
		this.tempoEmMin = tempoEmMin;
	}
	
	public boolean isConvidadoAtivo() {
		return convidadoAtivo;
	}
	public void setConvidadoAtivo(boolean convidadoAtivo) {
		this.convidadoAtivo = convidadoAtivo;
	}
	private String autor;
	private String convidado;
	private boolean convidadoAtivo;
	private String titulo;
	private ArrayList<Object> colecao = new ArrayList<>();
	private double tempoEmMin;
	
	
	
	
}
