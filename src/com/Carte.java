package com;

public class Carte {
	
	private ValueEnum valeurCarte;
	private ColorEnum couleurCarte;
		
	
	public Carte(ValueEnum valeurCarte, ColorEnum couleurCarte) {
		super();
		this.valeurCarte = valeurCarte;
		this.couleurCarte = couleurCarte;
	}
	public ValueEnum getValeurCarte() {
		return valeurCarte;
	}
	public void setValeurCarte(ValueEnum valeurCarte) {
		this.valeurCarte = valeurCarte;
	}
	public ColorEnum getCouleurCarte() {
		return couleurCarte;
	}
	public void setCouleurCarte(ColorEnum couleurCarte) {
		this.couleurCarte = couleurCarte;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((couleurCarte == null) ? 0 : couleurCarte.hashCode());
		result = prime * result + ((valeurCarte == null) ? 0 : valeurCarte.hashCode());
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
		Carte other = (Carte) obj;
		if (couleurCarte != other.couleurCarte)
			return false;
		if (valeurCarte != other.valeurCarte)
			return false;
		return true;
	}
	
	
	
	

}
