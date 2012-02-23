package model;

public class Cell
{
	Terrain terrain;

	public Cell (Terrain t) {
		setTerrain(t);
	}
	
	public void setTerrain (Terrain t) {
		this.terrain = t;
	}
	
	public Terrain getTerrain () {
		if (terrain == null)
		{
			System.out.println("WARNING: Accessing a Cell's null terrain\t---------");
		}
		return terrain;
	}
	
	public boolean passable ()
	{
		switch (terrain) 
		{
		case WATER:
			return false;
		case GRASS:
			return true;
		default:
			return false;
		}
	}
	
}
