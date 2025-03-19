package edu.uhu.monopoly;

public class FreeParkingCell extends Cell {

	public FreeParkingCell() {
		setName("Free Parking");
	}

	public boolean playAction(String MSG) {
		return true;
	}
}
