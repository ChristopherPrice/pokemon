/**
 * 
 */
package model;

/**
 * 
 */
public class Map {
	
	public static final Cell CELL_OOB = new Cell(null);
	
	private Cell[][] map;	//Cell[width][height]
	
	public Map (Terrain t, int width, int height) 
	{
		
		//Initialize map of Cells
		map = new Cell[width][height];
		
		//Initialize each cell with the Terrain passed in
		for (int x = 0; x < width; x++)
		{
			for (int y = 0; y < height; y++)
			{
				map[x][y] = new Cell(t);
			}
		}
	
	}
	
	public int getBoundX ()
	{
		return map.length;
	}
	
	public int getBoundY ()
	{
		return map[0].length;
	}
	
	public Cell getCell (int xCoordinate, int yCoordinate)
	{
		if ((xCoordinate < 0) || (yCoordinate < 0))
		{
			System.out.print("WARNING: Accessing ("+xCoordinate+","+yCoordinate+"). ");
			System.out.println("One of your coordinates is less than the minimum: 0");
			return CELL_OOB;
		}
		else if ((xCoordinate >= map.length) || (yCoordinate >= map[0].length))
		{
			System.out.print("WARNING: Accessing ("+xCoordinate+","+yCoordinate+"). ");
			System.out.print("One of your coordinates is greater than max: ");
			System.out.println("X_MAX="+(map.length-1)+" Y_MAX="+(map[0].length-1));
			return CELL_OOB;
		}
		else
		{
			return map[xCoordinate][yCoordinate];
		}
		
	}
	
}
