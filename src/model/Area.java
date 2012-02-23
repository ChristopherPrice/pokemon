/**
 * 
 */
package model;

/**
 * This class contains the items that will be drawn.
 *
 */
public class Area {
	
	private Character player;
	private Map map;
	
	public Area ()
	{
		
	}
	
	public Area (Map map, Character character)
	{
		setMap(map);
		setPlayer(character);
	}

	/**
	 * @return the player
	 */
	public Character getPlayer() {
		return player;
	}

	/**
	 * @param player the player to set
	 */
	public void setPlayer(Character player) {
		this.player = player;
	}

	/**
	 * @return the map
	 */
	public Map getMap() {
		return map;
	}

	/**
	 * @param map the map to set
	 */
	public void setMap(Map map) {
		this.map = map;
	}

}
