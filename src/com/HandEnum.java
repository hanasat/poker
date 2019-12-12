package com;

public enum HandEnum {
	CARTEFORTE(0),
	PAIRE(1),
	DOUBLEPAIRE(2),
	BRELAN(3),
	QUINTE(4),
	COULEUR(5),
	FULL(6),
	CARRE(7),
	QUINTEFLUSH(8),
	QUINTEFLUSHROYALE(9);
	
	int size;
	
	private HandEnum(int size) {
		
		this.size = size;
		
	}

	public int getSize() {
		return size;
	}
}
