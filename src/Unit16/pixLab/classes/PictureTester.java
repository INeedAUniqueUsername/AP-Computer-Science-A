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
	private final static String PATH = "src\\Unit16\\pixLab\\images\\";
	//private static final Picture pix = new Picture(PATH + "Capture.PNG");
	
	/** Method to test zeroBlue */
	public static Picture createPicture() {
		return new Picture(PATH + "Capture2.PNG");
	}
	public static void testZeroBlue(){
		Picture pix = createPicture();
		pix.explore();
		pix.zeroBlue();
		pix.explore();
		}
	public static void testKeepOnlyBlue() {
		Picture pix = createPicture();
		pix.explore();
		pix.keepOnlyBlue();
		pix.explore();
	}
	public static void testKeepOnlyRed() {
		Picture pix = createPicture();
		pix.explore();
		pix.keepOnlyRed();
		pix.explore();
	}
	public static void testKeepOnlyGreen() {
		Picture pix = createPicture();
		pix.explore();
		pix.keepOnlyGreen();
		pix.explore();
	}
	public static void testNegate() {
		Picture pix = createPicture();
		pix.explore();
		pix.negate();
		pix.explore();
	}
	/** Method to test mirrorVertical */
	public static void testMirrorVertical()
	{
		Picture pix = createPicture();
		pix.explore();
		pix.mirrorVertical();
		pix.explore();
	}
	public static void testGrayscale() {
		Picture pix = createPicture();
		pix.explore();
		pix.grayscale();
		pix.explore();
	}
	
	/** Method to test mirrorTemple */
	public static void testMirrorTemple()
	{
		Picture pix = createPicture();
		pix.explore();
		pix.mirrorTemple();
		pix.explore();
	}
	
	/** Method to test the collage method */
	public static void testCollage()
	{
		Picture pix = createPicture();
		pix.createCollage();
		pix.explore();
	}
	
	/** Method to test edgeDetection */
	public static void testEdgeDetection()
	{
		Picture pix = createPicture();
		pix.edgeDetection(10);
		pix.explore();
	}
	
	/** Main method for testing.	Every class can have a main
		* method in Java */
	public static void main(String[] args)
	{
		Picture pix = createPicture();
		pix.explore();
		//pix.flipSectionHorizontal(200, 200, 500, 500);
		//pix.swapSection(0, 0, 500, 500, 250, 250);
		for(int i = 0; i < 100; i++) {
			int w_p = pix.getWidth();
			int h_p = pix.getHeight();
			int x1 = Alex.random(w_p);
			int y1 = Alex.random(h_p);
			int w = Alex.random(w_p - x1);
			int h = Alex.random(h_p - y1);
			int x2 = Alex.random(w_p - w);
			int y2 = Alex.random(h_p - h);
			/*
			System.out.println(
					"Pix Width: " + w_p + "\n" +
					"Pix Height: " + h_p + "\n" +
					"Swap X1: " + x1 + "\n" +
					"Swap Y1: " + y1 + "\n" +
					"Swap Width: " + w + "\n" +
					"Swap Height: " + h + "\n" +
					"Swap X2: " + x2 + "\n" +
					"Swap Y2: " + y2 + "\n"
					);
			*/
			pix.swapSection(x1, y1, x2, y2, w, h);
		}
		for(int i = 0; i < 50; i++) {
			int w = pix.getWidth();
			int h = pix.getHeight();
			int x = Alex.random(w);
			int y = Alex.random(h);
			pix.flipSectionHorizontal(x, y, w-x, h-y);
		}
		pix.explore();
		// uncomment a call here to run a test
		// and comment out the ones you don't want
		// to run
		//testZeroBlue();	
		//testKeepOnlyBlue();
		//testKeepOnlyRed();
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
		Picture pix = createPicture();
		pix.moreJPEG(255);
		pix.moreJPEG(255);
		pix.moreJPEG(255);
		pix.moreJPEG(255);
		pix.moreJPEG(255);
		pix.moreJPEG(255);
		pix.moreJPEG(255);
		pix.moreJPEG(255);
		pix.explore();
		*/
	}
}