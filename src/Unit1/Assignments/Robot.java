package Unit1.Assignments;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class Robot extends Canvas
{
   public Robot()    //constructor method - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);   	
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString("Robot LAB ", 35, 35 );

      //call head method
      head(window);
      //call other methods
      upperBody(window);
      lowerBody(window);
   }

   public void head( Graphics window )
   {
      window.setColor(Color.YELLOW);

      window.fillOval(300, 100, 200, 100);


		//add more code here
      window.setColor(Color.BLACK);
      //Eyes
      window.drawOval(350, 120, 20, 20);
      window.drawOval(430, 120, 20, 20);
      //Mouth
      window.drawLine(370, 180, 430, 180);
   }

   public void upperBody( Graphics window )
   {

		//add more code here
	   window.drawRect(350, 210, 100, 100);
	   //Left arm
	   window.drawLine(350, 240, 320, 240);
	   window.drawLine(320, 240, 320, 330);  
	   //Right arm
	   window.drawLine(450, 240, 480, 240);
	   window.drawLine(480, 240, 480, 330);
   }

   public void lowerBody( Graphics window )
   {

		//add more code here
	   window.drawRect(350, 320, 100, 100);
	   //Left leg
	   window.drawLine(370, 420, 370, 500);
	   //Right leg
	   window.drawLine(430, 420, 430, 500);
   }
}