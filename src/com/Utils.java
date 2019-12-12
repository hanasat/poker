package com;

import java.util.ArrayList;
import java.util.List;

public class Utils {
	
	public Carte UpperCarte(Carte c1, Carte c2) {
		if (c1.getValeurCarte().compareTo(c2.getValeurCarte()) == 0) {
			return c1;
		}else if ((c1.getValeurCarte().compareTo(c2.getValeurCarte()) < 0)) {
			return c2;
		}else {
			return c1;
		}
	}
	
	public boolean isSameColor(Carte c1, Carte c2) {
		if(c1.getCouleurCarte().equals(c2.getCouleurCarte())) {
			System.out.println("couleur c1 = couleur c2");
			return true;
		}else {
			System.out.println("couleur c1 != couleur c2");
			return false;
					}
	}
	
	public List<Carte> Sort(List<Carte> list) {
		for (int j = 0 ; j < list.size()-1; ++j)
			for (int i = 0 ; i < list.size()-1; ++i) {
				Carte a = list.get(i) ;
				Carte b = list.get(i) ;			
				if (a.getValeurCarte().getSize() > b.getValeurCarte().getSize()) {
					Carte t = a ;
					a = b ;
					b = t ;
				}
			}
		
		return list;
	} 	
}

