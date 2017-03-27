package Unit15.Assignments;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int pos_x;
	private int pos_y;
	private int width;
	private int height;

	private Color color;

	public Block()
	{
		this(0, 0, 0, 0, new Color(0));
	}
	public Block(int x, int y) {
		this(x, y, 0, 0);
	}
	public Block(int x, int y, int w, int h) {
		this(x, y, w, h, new Color(0));
	}
	public Block(int x, int y, int w, int h, Color c) {
		setPos(x, y);
		setDimensions(w, h);
		setColor(c);
	}
	@Override
	public void setPos(int x, int y) {
		// TODO Auto-generated method stub
		setX(x);
		setY(y);
	}
	@Override
	public void setX(int x) {
		// TODO Auto-generated method stub
		pos_x = x;
	}
	@Override
	public void setY(int y) {
		// TODO Auto-generated method stub
		pos_y = y;
	}
	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return pos_x;
	}
	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return pos_y;
	}
	public void setDimensions(int w, int h) {
		setWidth(w);
		setHeight(h);
	}
	public void setWidth(int w) {
		width = w;
	}
	public int getWidth() {
		return width;
	}
	public void setHeight(int h) {
		height = h;
	}
	public int getHeight() {
		return height;
	}
	public void setColor(Color c) {
		color = c;
	}
	public Color getColor() {
		return color;
	}
	//add other Block constructors - x , y , width, height, color
   //add the other set methods
	public void draw(Graphics window)
	{
		draw(window, color);
	}
	public void draw(Graphics window, Color col)
	{
		window.setColor(col);
		window.fillRect(getX(), getY(), getWidth(), getHeight());
	}
   
	public boolean equals(Object obj)
	{
		if(obj instanceof Block) {
			Block b = (Block) obj;
			return (
					getX() == b.getX() &&
					getY() == b.getY() &&
					getWidth() == b.getWidth() &&
					getHeight() == b.getHeight() &&
					getColor() == b.getColor()
					);
		}
		return false;
	}
	public String toString() {
		return String.format("%d %d %d %d %s", pos_x, pos_y, width, height, color);
		/*
		return String.format(	"Position: (%d, %d)" + "\n" +
								"Dimensions: %d x %d" + "\n" +
								"Color: %d, %d, %d" + "\n",
								pos_x, pos_y, width, height, color.getRed(), color.getGreen(), color.getBlue());
		*/
	}
}