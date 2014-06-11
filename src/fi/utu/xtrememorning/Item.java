package fi.utu.xtrememorning;

public class Item {
	public int ID;
	public String description;
	
	@SuppressWarnings("unused")
	private Item() {}
	
	public Item(int ID) {
		this.ID = ID;
	}
}
