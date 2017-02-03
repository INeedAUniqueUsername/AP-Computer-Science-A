package Unit1.InstructionExamples;
//© A+ Computer Science  -  www.apluscompsci.com
//Name - Alex Chen
//Date - 2/2/17
//Class - Period 2
//Lab  -

import static java.lang.System.*;

public class StarsAndStripes
{
   public StarsAndStripes()
   {
      out.println("StarsAndStripes");
      printTwoBlankLines();
   }

   public void printTwentyStars()
   {
	   out.println("********************");
   }

   public void printTwentyDashes()
   {
	   out.println("--------------------");
   }

   public void printTwoBlankLines()
   {
	   out.println();
	   out.println();
   }
   
   public void printASmallBox()
   {
	   /*
	   System.out.println(		"-------------");
	   for(int i = 0; i < 10; i++)
	   {
		   System.out.println(	"|           |");
	   }
	   System.out.println(		"-------------");
	   */
	   for(int i = 0; i < 3; i++)
	   {
		   printTwentyDashes();
		   printTwentyStars();
	   }
	   printTwentyDashes();
   }
 
   public void printABigBox()
   { 	
	   /*
	   System.out.println(		"----------------------------");
	   for(int i = 0; i < 10; i++)
	   {
		   System.out.println(	"|                          |");
	   }
	   System.out.println(		"----------------------------");
	   */
	   for(int i = 0; i < 7; i++)
	   {
		   printTwentyDashes();
		   printTwentyStars();
	   }
	   printTwentyDashes();
   }   
}