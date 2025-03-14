package edu.uhu.monopoly;

public interface IOwnable {

	Player getProprietary();

	boolean isAvailable();

	void setAvailable(boolean available);

	void setProprietary(Player owner);

}