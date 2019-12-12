
package com;

import java.util.ArrayList;
import java.util.List;




public class Hand{
	List<Carte> list_card = new ArrayList<Carte>();

	
	public List<Carte> getList_card() {
		return list_card;
	}

	public void setList_card(List<Carte> list_card) {
		this.list_card = list_card;
	}
	public Hand(){
		super() ;
		//list_card = sort(list_c);
	}
	
}

