package edu.uhu.monopoly;

public abstract class Cell {
	private boolean available = true;
	private String name;
	protected Player proprietary;

	public String getName() {
		return name;
	}

	public Player getProprietary() {
		return proprietary;
	}
	
	public int getPrice() {
		return 0;
	}

	public boolean isAvailable() {
		return available;
	}
	
	public abstract void playAction();

	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	void setName(String name) {
		this.name = name;
	}

	public void setProprietary(Player owner) {
		this.proprietary = owner;
	}
    
    public String toString() {
        return name;
    }
}
