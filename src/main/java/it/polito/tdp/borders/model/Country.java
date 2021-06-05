package it.polito.tdp.borders.model;

public class Country {

	private int codice;
	private String nomeAbb;
	private String nomeComp;
	public Country(int codice, String nomeAbb, String nomeComp) {
		super();
		this.codice = codice;
		this.nomeAbb = nomeAbb;
		this.nomeComp = nomeComp;
	}
	public int getCodice() {
		return codice;
	}
	public void setCodice(int codice) {
		this.codice = codice;
	}
	public String getNomeAbb() {
		return nomeAbb;
	}
	public void setNomeAbb(String nomeAbb) {
		this.nomeAbb = nomeAbb;
	}
	public String getNomeComp() {
		return nomeComp;
	}
	public void setNomeComp(String nomeComp) {
		this.nomeComp = nomeComp;
	}
	@Override
	public String toString() {
		return "Country [codice=" + codice + ", nomeAbb=" + nomeAbb + ", nomeComp=" + nomeComp + "]";
	}
	
	
	
}
