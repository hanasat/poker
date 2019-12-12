package com;

public enum ColorEnum {
	COEUR(0),
	CARREAU(1),
	TREFLE(2),
	PIQUE(3);	

	int size;
	
	private ColorEnum(int size) {
		this.size = size;
		
	}
	
	public int getSize() {
		return size;
	}
}