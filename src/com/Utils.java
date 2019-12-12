package com;

public class Utils {
	
	public Carte UpperCase(Carte c1, Carte c2) {
		if (c1.getValeurCarte().compareTo(c2.getValeurCarte()) == 0) {
			return c1;
		}else if ((c1.getValeurCarte().compareTo(c2.getValeurCarte()) < 0)) {
			return c2;
		}else {
			return c1;
		}
	}
	
	public boolean inSameColor(Carte c1, Carte c2) {
		if(c1.getCouleurCarte().equals(c2.getCouleurCarte())) {
			return true;
		}else {
			return false;
		}
	}

	
}
