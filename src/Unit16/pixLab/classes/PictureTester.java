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
	final static String PATH = "src\\Unit16\\pixLab\\images\\";
	//private static final Picture pix = new Picture(PATH + "Capture.PNG");
	
	/** Method to test zeroBlue */
	public static Picture createPicture() {
		return new Picture(PATH + "beach.jpg");
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
	public static void testMirrorVerticalRightToLeft()
	{
		Picture pix = createPicture();
		pix.explore();
		pix.mirrorVerticalRightToLeft();
		pix.explore();
	}
	public static void testMirrorHorizontal() {
		Picture pix = createPicture();
		pix.explore();
		pix.mirrorHorizontal();
		pix.explore();
	}
	public static void testMirrorHorizontalBottomToTop() {
		Picture pix = createPicture();
		pix.explore();
		pix.mirrorHorizontalBottomToTop();
		pix.explore();
	}
	public static void testMirrorDiagonal() {
		Picture pix = createPicture();
		pix.explore();
		pix.mirrorDiagonal();
		pix.explore();
	}
	public static void testGrayscale() {
		Picture pix = createPicture();
		pix.explore();
		pix.grayscale();
		pix.explore();
	}
	public static void textFixUnderwater() {
		Picture pix = new Picture(PATH + "water.jpg");
		pix.explore();
		pix.fixUnderwater();
		pix.explore();
	}
	/** Method to test mirrorTemple */
	public static void testMirrorTemple()
	{
		Picture pix = new Picture(PATH + "temple.jpg");
		pix.explore();
		pix.mirrorTemple();
		pix.explore();
	}
	public static void testMirrorArms() {
		Picture pix = new Picture(PATH + "snowman.jpg");
		pix.explore();
		pix.mirrorArms();
		pix.explore();
	}
	public static void testMirrorGull() {
		Picture pix = new Picture(PATH + "seagull.jpg");
		pix.explore();
		pix.mirrorGull();
		pix.explore();
	}
	public static void testCopy() {
		Picture pix = createPicture();
		pix.explore();
		pix.copy(pix, 200, 200);
		pix.copy(pix, 0, 500);
		pix.copy(pix, 500, 0);
		pix.explore();
	}
	/** Method to test the collage method */
	public static void testCollage()
	{
		Picture pix = createPicture();
		pix.createCollage();
		pix.explore();
	}
	public static void testMyCollage() {
		Picture pix = createPicture();
		pix.myCollage();
		pix.explore();
	}
	
	/** Method to test edgeDetectionHorizontal */
	public static void testEdgeDetectionHorizontal()
	{
		Picture pix = createPicture();
		pix.edgeDetectionHorizontal(10);
		pix.explore();
	}
	public static void testEdgeDetectionVertical() {
		Picture pix = createPicture();
		pix.edgeDetectionVertical(10);
		pix.explore();
	}
	public static void testEdgeDetectionCustom() {
		Picture pix = createPicture();
		pix.edgeDetectionCustom(25);
		pix.explore();
	}
	/** Main method for testing.	Every class can have a main
		* method in Java */
	public static void main(String[] args)
	{
		
		Picture p = createPicture();
		for(int i = 0; i < 5; i++) {
			Picture p_new = createPicture();
			int h = p.getHeight();
			int w = p.getWidth();
			p = Picture.lossy(p, Math.random()*3);
			p.moreJPEG((int) (Math.random() * 20));
			int frs = Alex.random(h);
			int fcs = Alex.random(w);
			int fre = Alex.random(h-frs);
			int fce = Alex.random(w-fcs);
			p_new.copy(p, frs, fcs, fre, fce, Alex.random(p_new.getHeight()), Alex.random(p_new.getWidth()));
			p = p_new;
		}
		p.explore();
		//pix.flipSectionHorizontal(200, 200, 500, 500);
		//pix.swapSection(0, 0, 500, 500, 250, 250);
		
		/*
		//Destroy the picture
		for(int i = 0; i < 10; i++) {
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
			*//*
			pix.swapSection(x1, y1, x2, y2, w, h);
			pix.moreJPEG(x1, y1, w, h, Alex.random(20));
			pix.moreJPEG(x2, y2, w, h, Alex.random(20));
			pix = Picture.lossy(pix, 2);
			pix.moreJPEG(x1, y1, w, h, Alex.random(20));
			pix.moreJPEG(x2, y2, w, h, Alex.random(20));
			pix.swapSection(x1, y1, x2, y2, w, h);
		}
		/*
		for(int i = 0; i < 50; i++) {
			int w = pix.getWidth();
			int h = pix.getHeight();
			int x = Alex.random(w);
			int y = Alex.random(h);
			pix.flipSectionHorizontal(x, y, w-x, h-y);
		}
		*/
		//pix.explore();
		// uncomment a call here to run a test
		// and comment out the ones you don't want
		// to run
		/*
		testZeroBlue();	
		testKeepOnlyBlue();
		testKeepOnlyRed();
		testKeepOnlyGreen();
		testNegate();
		testGrayscale();
		textFixUnderwater();
		testMirrorVertical();
		testMirrorVerticalRightToLeft();
		testMirrorHorizontal();
		testMirrorHorizontalBottomToTop();
		testMirrorDiagonal();
		testMirrorTemple();
		testMirrorArms();
		testMirrorGull();
		//testMirrorDiagonal();
		/*
		testCollage();
		testMyCollage();
		testCopy();
		testEdgeDetectionHorizontal();
		testEdgeDetectionVertical();
		testEdgeDetectionCustom();
		*/
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
		*/
	}
}