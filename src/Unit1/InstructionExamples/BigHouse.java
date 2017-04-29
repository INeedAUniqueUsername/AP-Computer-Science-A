package Unit1.InstructionExamples;


//© A+ Computer Science  -  www.apluscompsci.com
//Name - John Doe
//Date - 2/3/17
//Class - Period 2
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class BigHouse extends Canvas
{
   public BigHouse()  //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      bigHouse(window);
   }

   public void bigHouse( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString( "BIG HOUSE ", 50, 50 );

      window.setColor(Color.BLUE);

      window.fillRect( 200, 200, 400, 400 );
      
      //Roof
      window.setColor(Color.RED);
      window.drawLine(100, 200, 200, 100);
      window.drawLine(200, 100, 600, 100);
      window.drawLine(600, 100, 700, 200);
      window.drawLine(100, 200, 700, 200);
      
      int[] x = new int[]{100, 200, 600, 700, 100};
      int[] y = new int[]{200, 100, 100, 200, 200};
      window.fillPolygon(x, y, 5);
   }
}