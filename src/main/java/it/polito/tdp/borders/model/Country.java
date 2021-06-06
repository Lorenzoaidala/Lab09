package it.polito.tdp.borders.model;

public class Country implements Comparable<Country>{

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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codice;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Country other = (Country) obj;
		if (codice != other.codice)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Country [codice=" + codice + ", nomeAbb=" + nomeAbb + ", nomeComp=" + nomeComp + "]";
	}
	public int compareTo(Country o) {
		return this.nomeAbb.compareTo(o.nomeAbb);
	}
	
	
	
}
