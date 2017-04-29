package Unit1.InstructionExamples;


//© A+ Computer Science  -  www.apluscompsci.com
//Name - John Doe
//Date - 2/3/17
//Class - AP Computer Science A
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class SmileyFace extends Canvas
{
   public SmileyFace()    //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      smileyFace(window);
   }

   public void smileyFace( Graphics window )
   {
      window.setColor(Color.BLUE);
      window.drawString("SMILEY FACE LAB ", 35, 35);

      window.setColor(Color.YELLOW);
      window.fillOval( 210, 100, 400, 400 );
      

		//add more code here
      window.setColor(Color.BLACK);
      
      //Smile
      window.drawArc(265, 150, 300, 300, 225, 90);
      
      //Eyes
      window.drawOval(300, 200, 50, 50);
      window.drawOval(460, 200, 50, 50);
   }
}