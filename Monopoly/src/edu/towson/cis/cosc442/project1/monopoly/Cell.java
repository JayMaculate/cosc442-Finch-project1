package edu.towson.cis.cosc442.project1.monopoly;

public abstract class Cell implements IOwnable {
	private String name;
	protected Player theOwner;
	private boolean available = true;

	public String getName() {
		return name;
	}

	/* (non-Javadoc)
	 * @see edu.towson.cis.cosc442.project1.monopoly.IOwnable#getOwner()
	 */
	@Override
	public Player getOwner() {
		return theOwner;
	}
	
	public int getPrice() {
		return 0;
	}

	public abstract void playAction();

	void setName(String name) {
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see edu.towson.cis.cosc442.project1.monopoly.IOwnable#setOwner(edu.towson.cis.cosc442.project1.monopoly.Player)
	 */
	@Override
	public void setOwner(Player owner) {
		this.theOwner = owner;
	}
    
    public String toString() {
        return name;
    }

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}
}
