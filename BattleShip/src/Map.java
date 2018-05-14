

public class Map {
		
	private String name;
	private int bounds;
	private String[][] data;
	
	public Map(String name, int bounds) {
		this.setName(name);
		this.setBounds(bounds);
		this.setData(new String[bounds][bounds]);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBounds() {
		return bounds;
	}

	public void setBounds(int bounds) {
		this.bounds = bounds;
	}

	public String[][] getData() {
		return data;
	}

	public void setData(String[][] data) {
		this.data = data;
	}
	
}
