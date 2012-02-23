package tests;

import view.Display;
import model.Area;
import model.Character;
import model.Map;
import model.Terrain;

public class ConsoleTest {
	
	public ConsoleTest ()
	{
		init();
		
		//Draws 4x4 map of grass. Player should be in upper corner
		Character player = new Character();
		Map map = new Map(Terrain.GRASS,4,4);
		Area area = new Area(map,player);
		Display.PrintToConsole(area);
		
		player.setCoordX(2);
		Display.PrintToConsole(area);
		
		player.setCoords(1, 3);
		Display.PrintToConsole(area);
		
	}

	private void init() {
		//initialize any global variables	
	}

}
