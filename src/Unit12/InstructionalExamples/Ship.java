package Unit12.InstructionalExamples;


//© A+ Computer Science
// www.apluscompsci.com

//interface example

public class Ship implements Locatable, Movable
{
	private int xPos, yPos;

	public Ship()
	{
		xPos=yPos=0;
	}

	public Ship(int x, int y)
	{
		xPos=x;
		yPos=y;
	}

	
	//add set methods - use Movable interface
	@Override
	public void setX(int x) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setY(int y) {
		// TODO Auto-generated method stub
		
	}
	//add get methods - use Locatable interface
	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return 0;
	}
	

	public boolean equals(Object obj)
	{
	   Ship other = (Ship)obj;
	   if(xPos==other.xPos&&yPos==other.yPos)
	      return true;
	   return false;	
	}
	
	public String toString()
	{
		return " "+xPos+" "+yPos;
	}

	@Override
	public void setPos(int x, int y) {
		// TODO Auto-generated method stub
		
	}
}