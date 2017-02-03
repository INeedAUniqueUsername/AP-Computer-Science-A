package Unit1.Assignments;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Shape
{
   //instance variables
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private Color color;

	//int identity = (int)(Math.random() * 6);
   public Shape(int x, int y, int wid, int ht, Color col)
   {
		xPos = x;
		//finish this constructor
		yPos = y;
		width = wid;
		height = ht;
		color = col;
   }


   public void draw(Graphics window)
   {
      window.setColor(color);
      window.fillRect(xPos, yPos, width, height);
      for(int i = 0; i < height; i++)
      {
    	  window.fillRect(xPos+i, yPos-i, width-2*i, 1);
    	  window.fillRect(xPos+i, yPos+height+i, width-2*i, 1);
      }
      /*
	  switch(identity)
      {
      case 0:
    	  //Oval
    	  window.fillOval(xPos-width/2, yPos-height/2, width, height);
    	  break;
      case 1:
    	  //Rectangle
    	  window.fillRect(xPos-width/2, yPos-height/2, width, height);
    	  break;
      case 2:
    	  //Diagonal line: Right-Down
    	  window.drawLine(xPos, yPos, xPos + width, yPos + height);
    	  break;
      case 3:
    	  //Diagonal line: Right-Up
    	  window.drawLine(xPos, yPos, xPos + width, yPos - height);
    	  break;
      case 4:
    	  //Diagonal line: Left-down
    	  window.drawLine(xPos, yPos, xPos - width, yPos + height);
    	  break;
      case 5:
    	  //Diagonal line: Left-up
    	  window.drawLine(xPos, yPos, xPos-width, yPos-height);
    	  break;
      }
	  */
   }

   //BONUS
   //add in set and get methods for all instance variables

   public String toString()
   {
   	return xPos+" "+yPos+" "+width+" "+height+" "+color;
   }
   
	public int getxPos() {
		return xPos;
	}


	public void setxPos(int xPos) {
		this.xPos = xPos;
	}


	public int getyPos() {
		return yPos;
	}


	public void setyPos(int yPos) {
		this.yPos = yPos;
	}


	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public Color getColor() {
		return color;
	}


	public void setColor(Color color) {
		this.color = color;
	}
}