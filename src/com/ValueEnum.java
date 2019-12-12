package com;

public enum ValueEnum {
	DEUX(0),
	TROIS(1),
	QUATRE(2),
	CINQ(3),
	SIX(4),
	SEPT(5),
	HUIT(6),
	NEUF(7),
	DIX(8),
	VALET(9),
	DAME(10),
	ROI(11),
	AS(12);
	
	int size;
	
	private ValueEnum(int size) {
		
		this.size = size;
		
	}

	public int getSize() {
		return size;
	}
}
