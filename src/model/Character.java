/**
 * 
 */
package model;

/**
 *
 */
public class Character {
	
	private int coordX;
	private int coordY;
	
	public Character ()
	{
		setCoordX(0);
		setCoordY(0);
	}
	
	public Character (int initalXCoordinate, int initialYCoordinate)
	{
		setCoordX(initalXCoordinate);
		setCoordY(initialYCoordinate);
	}
	
	public void setCoords(int xCoordinate, int yCoordinate)
	{
		setCoordX(xCoordinate);
		setCoordY(yCoordinate);
	}
	
	public int getCoordX()
	{
		return coordX;
	}
	
	public void setCoordX(int newXCoordinate)
	{
		this.coordX = newXCoordinate;
	}

	public int getCoordY()
	{
		return coordY;
	}
	
	public void setCoordY(int newYCoordinate)
	{
		this.coordY = newYCoordinate;
	}
	
}
