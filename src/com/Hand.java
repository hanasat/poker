
package com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Hand{
	List<Carte> list_card = new ArrayList<Carte>();

	
	public List<Carte> getList_card() {
		return list_card;
	}

	public void setList_card(List<Carte> list_card) {
		this.list_card = list_card;
	}
	
	public Hand(ArrayList<Carte> list_C){
		Utils utils = new Utils();
		list_card = utils.Sort(list_C);
	}

	public List<Carte> listCarre(){
		List<Carte> list_carre = new ArrayList<Carte>();
		
		for(int i=0; i<list_card.size()-3; i++){
			if ((list_card.get(i) == list_card.get(i+1))
			&&(list_card.get(i+1) == list_card.get(i+2))
			&&(list_card.get(i+2) == list_card.get(i+3))){
				list_carre.add(list_card.get(i));
			}
		}
		
		return list_carre;
	}
	
	public List<Carte> listBrelan(){
		List<Carte> list_brelan = new ArrayList<Carte>();
		
		for(int i=0; i<list_card.size()-2; i++){
			if ((list_card.get(i) == list_card.get(i+1))
			&&(list_card.get(i+1) == list_card.get(i+2))){
				list_brelan.add(list_card.get(i));
			}
		}
		
		return list_brelan;
	}
	
	public List<Carte> listPair(){
		List<Carte> list_pair = new ArrayList<Carte>();
		
		for(int i=0; i<list_card.size()-1; i++){
			if (list_card.get(i) == list_card.get(i+1)){
				list_pair.add(list_card.get(i));
			}
		}
		
		return list_pair;
	}
	
	public List<Carte> listQuinte(){
		List<Carte> list_quinte = new ArrayList<Carte>();
		
		for(int i=0; i<list_card.size()-4; i++){
			if(((list_card.get(i).getValeurCarte().getSize()) == (list_card.get(i+1).getValeurCarte().getSize() +1))
			&&((list_card.get(i+1).getValeurCarte().getSize()) == (list_card.get(i+2).getValeurCarte().getSize()+1))
			&&((list_card.get(i+2).getValeurCarte().getSize()) == (list_card.get(i+3).getValeurCarte().getSize()+1))
			&&((list_card.get(i+2).getValeurCarte().getSize()) == (list_card.get(i+4).getValeurCarte().getSize()+1))){
				list_quinte.add(list_card.get(i+4));
			}
		}
			
		return list_quinte;
	}
	/*
	public List<Carte> listQuinteFlush(){
		List<Carte> list_quinteFlush = new ArrayList<Carte>();
		
		for(int i=0; i<list_card.size()-4; i++){
			if( (list_card.get(i).egal(list_card.get(i+1)))
			&&(list_card.get(i+1).egal(list_card.get(i+2)))
			&&(list_card.get(i+2).egal(list_card.get(i+3)))
			&&(list_card.get(i+2).egal(list_card.get(i+4)))){
				list_quinteFlush.add(list_card.get(i+4));
			}
		}
		
		return list_quinteFlush;
	}
	
	public List<Carte> listCouleur(){
		List<Carte> list_couleur = new ArrayList<Carte>();
		
		for(int i=0; i<list_card.size()-4; i++){
			if ((list_card.get(i).getCouleurCarte() == (list_card.get(i+1).getCouleurCarte()))
			&&(list_card.get(i+1).getCouleurCarte() == (list_card.get(i+2).getCouleurCarte()))
			&&(list_card.get(i+2).getCouleurCarte() == (list_card.get(i+3).getCouleurCarte()))
			&&(list_card.get(i+2).getCouleurCarte() == (list_card.get(i+4).getCouleurCarte()))){
				list_couleur.add(list_card.get(i+4));
			}
	}
	
	return list_couleur;
	}
	
	public boolean quinteFlushRoyale(){
		boolean quinteFlushRoyale = false;
		
		for(int i=0; i<list_card.lenght()-4; i++){
			if ((list_card[i] == (list_card[i+1]+1))
			&&(list_card[i+1] == (list_card[i+2]+1))
			&&(list_card[i+2] == (list_card[i+3]+1))
			&&(list_card[i+2] == (list_card[i+4]+1)
			&&(list_card[i+4] == "AS")){
				quinteFlushRoyale = true;
			}
		}
		
		return quinteFlushRoyale;
	}
	
	public List<Carte> listFull(){
		List<Card> list_full = new ArrayList<Carte>;
		
			if ((listBrelan().lenght() != 0)
			&&(listPair().lenght() != 0)){
				list_full.append(listBrelan.lenght()-1);
				list_full.append(listPair.lenght()-1);
			
			}
		
		return list_full;
	}
	
	public Pair<STRONG_HAND,List<Carte> meilleurCombinaison(){
		if (quinteFlushRoyale())
			return Pair<QuinteFlushRoyale,0>;
		else if(listQuinteFlush().lenght()!=0)
			return Pair<QuinteFlush,listQuinteFlush()>;
		else if(listCarre().lenght()!=0)
			return Pair<Carre,listCarre()>;
		else if(listFull().lenght()!=0)
			return Pair<Full,listFull()>;
		else if(listCouleur().lenght()!=0)
			return Pair<Couleur,listCouleur()>;
		else if(listQuinte().lenght()!=0)
			return Pair<Quinte,listQuinte()>;
		else if(listBrelan().lenght()!=0)
			return Pair<Brelan,listBrelan()>;
		else if(listPair().lenght()>1)
			return Pair<DoublePaire,listPair()>;
		else if(listPair().lenght()!=0)
			return Pair<Paire,listPair()>;
		else
			return CarteForte;
	}
*/
}
