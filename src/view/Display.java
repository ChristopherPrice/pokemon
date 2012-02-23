package view;

import model.Area;
import model.Cell;
import model.Map;
import model.Character;
import model.Terrain;

public class Display {
	
	public static void PrintToConsole(Area area)
	{
		
		Map map = area.getMap();
		Character player = area.getPlayer();
		int playerX = player.getCoordX();
		int playerY = player.getCoordY();
		Cell currentCell;
		for (int y = 0; y < map.getBoundY(); y++)
		{
			for (int x = 0; x < map.getBoundX(); x++)
			{
				currentCell = map.getCell(x, y);
				Terrain t = currentCell.getTerrain();
				
				if ((x == playerX) && (y == playerY))
				{
					System.out.print("[P]");
				}
				else
				{
					switch (t)
					{
					case GRASS:
						System.out.print("[G]");
						break;
					case WATER:
						System.out.print("[W]");
						break;
					}
				}
				
			}
			System.out.println();
		}
		System.out.println();
		
	}
}
