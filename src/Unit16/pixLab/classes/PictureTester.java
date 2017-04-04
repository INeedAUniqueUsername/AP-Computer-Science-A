package Unit16.pixLab.classes;

import Misc.Alex;

/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.	Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
	static String PATH = "src\\Unit16\\pixLab\\images\\";
	private static final Picture pix = new Picture(PATH + "Capture.PNG");
	
	/** Method to test zeroBlue */
	public static void testZeroBlue(){
		Picture beach = new Picture(PATH + "beach.jpg");
		beach.explore();
		beach.zeroBlue();
		beach.explore();
		}
	public static void testKeepOnlyBlue() {
		pix.explore();
		for(Pixel[] pp : pix.getPixels2D()) {
			for(Pixel p : pp) {
				p.setRed(0);
				p.setGreen(0);
			}
		}
		pix.explore();
	}
	public static void testKeepOnlyRed() {
		pix.explore();
		for(Pixel[] pp : pix.getPixels2D()) {
			for(Pixel p : pp) {
				p.setGreen(0);
				p.setBlue(0);
			}
		}
		pix.explore();
	}
	public static void testKeepOnlyGreen() {
		pix.explore();
		for(Pixel[] pp : pix.getPixels2D()) {
			for(Pixel p : pp) {
				p.setRed(0);
				p.setBlue(0);
			}
		}
		pix.explore();
	}
	/** Method to test mirrorVertical */
	public static void testMirrorVertical()
	{
		Picture caterpillar = new Picture(PATH + "caterpillar.jpg");
		caterpillar.explore();
		caterpillar.mirrorVertical();
		caterpillar.explore();
	}
	
	/** Method to test mirrorTemple */
	public static void testMirrorTemple()
	{
		Picture temple = new Picture(PATH + "temple.jpg");
		temple.explore();
		temple.mirrorTemple();
		temple.explore();
	}
	
	/** Method to test the collage method */
	public static void testCollage()
	{
		Picture canvas = new Picture(PATH + "640x480.jpg");
		canvas.createCollage();
		canvas.explore();
	}
	
	/** Method to test edgeDetection */
	public static void testEdgeDetection()
	{
		Picture swan = new Picture(PATH + "swan.jpg");
		swan.edgeDetection(10);
		swan.explore();
	}
	
	/** Main method for testing.	Every class can have a main
		* method in Java */
	public static void main(String[] args)
	{
		// uncomment a call here to run a test
		// and comment out the ones you don't want
		// to run
		//testZeroBlue();	
		//testKeepOnlyBlue();
		testKeepOnlyRed();
		//testKeepOnlyGreen();
		//testNegate();
		//testGrayscale();
		//testFixUnderwater();
		//testMirrorVertical();
		//testMirrorTemple();
		//testMirrorArms();
		//testMirrorGull();
		//testMirrorDiagonal();
		//testCollage();
		//testCopy();
		//testEdgeDetection();
		//testEdgeDetection2();
		//testChromakey();
		//testEncodeAndDecode();
		//testGetCountRedOverValue(250);
		//testSetRedToHalfValueInTopHalf();
		//testClearBlueOverValue(200);
		//testGetAverageForColumn(0);
		/*
		Picture pix = new Picture(PATH + "Capture.PNG");
		for (Pixel[] pp : pix.getPixels2D())
		{
			for (Pixel p : pp)
			{
				p.setBlue(p.getBlue() + Alex.random(200)-100);
				p.setRed(p.getRed() + Alex.random(200)-100);
				p.setGreen(p.getGreen() + Alex.random(200)-100);
			}
		}
		pix.explore();
		*/
	}
}