package it.polito.tdp.borders.model;

public class Border {

	private int codice1;
	private int codice2;
	private int anno;
	public Border(int codice1, int codice2, int anno) {
		super();
		this.codice1 = codice1;
		this.codice2 = codice2;
		this.anno = anno;
	}
	public int getCodice1() {
		return codice1;
	}
	public void setCodice1(int codice1) {
		this.codice1 = codice1;
	}
	public int getCodice2() {
		return codice2;
	}
	public void setCodice2(int codice2) {
		this.codice2 = codice2;
	}
	public int getAnno() {
		return anno;
	}
	public void setAnno(int anno) {
		this.anno = anno;
	}
	@Override
	public String toString() {
		return "Border [codice1=" + codice1 + ", codice2=" + codice2 + ", anno=" + anno + "]";
	}
	
}
