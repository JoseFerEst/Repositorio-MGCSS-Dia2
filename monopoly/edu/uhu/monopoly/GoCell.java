package edu.uhu.monopoly;

public class GoCell extends Cell {
	public GoCell() {
		super.setName("Go");
		setAvailable(false);
	}

	public boolean playAction(String MSG) {
    	return true;
	}
	
	void setName(String name) {
	}
}
