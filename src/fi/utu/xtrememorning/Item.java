package fi.utu.xtrememorning;

public class Item implements ActionyThingy {
	public int ID;
	public String name;
	public String description;
	
	@SuppressWarnings("unused")
	private Item() {}
	
	public Item(int ID, String name, String description) {
		this.ID = ID;
		this.name = name;
		this.description = description;
	}
	
	public String getName() {
		return "Item";
	}
}
