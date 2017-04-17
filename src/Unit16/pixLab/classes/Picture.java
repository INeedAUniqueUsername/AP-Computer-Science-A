package Unit16.pixLab.classes;
import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

import Misc.Alex;

/**
 * A class that represents a picture.	This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.	
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
	///////////////////// constructors //////////////////////////////////
	
	/**
	 * Constructor that takes no arguments 
	 */
	public Picture ()
	{
		/* not needed but use it to show students the implicit call to super()
		 * child constructors always call a parent constructor 
		 */
		super();	
	}
	
	/**
	 * Constructor that takes a file name and creates the picture 
	 * @param fileName the name of the file to create the picture from
	 */
	public Picture(String fileName)
	{
		// let the parent class handle this fileName
		super(fileName);
	}
	
	/**
	 * Constructor that takes the width and height
	 * @param height the height of the desired picture
	 * @param width the width of the desired picture
	 */
	public Picture(int height, int width)
	{
		// let the parent class handle this width and height
		super(width,height);
	}
	
	/**
	 * Constructor that takes a picture and creates a 
	 * copy of that picture
	 * @param copyPicture the picture to copy
	 */
	public Picture(Picture copyPicture)
	{
		// let the parent class do the copy
		super(copyPicture);
	}
	
	/**
	 * Constructor that takes a buffered image
	 * @param image the buffered image to use
	 */
	public Picture(BufferedImage image)
	{
		super(image);
	}
	
	////////////////////// methods ///////////////////////////////////////
	
	/**
	 * Method to return a string with information about this picture.
	 * @return a string with information about the picture such as fileName,
	 * height and width.
	 */
	public String toString()
	{
		String output = "Picture, filename " + getFileName() + 
			" height " + getHeight() 
			+ " width " + getWidth();
		return output;
		
	}
	
	/** Method to set the blue to 0 */
	public void zeroBlue()
	{
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels)
		{
			for (Pixel pixelObj : rowArray)
			{
				pixelObj.setBlue(0);
			}
		}
	}		
	public void keepOnlyBlue() {
		for(Pixel p : getPixels()) {
			p.setRed(0);
			p.setGreen(0);
		}
	}
	public void keepOnlyRed() {
		for(Pixel p : getPixels()) {
			p.setGreen(0);
			p.setBlue(0);
		}
	}
	public void keepOnlyGreen() {
		for(Pixel p : getPixels()) {
			p.setRed(0);
			p.setBlue(0);
		}
	}
	public void negate() {
		for(Pixel p : getPixels()) {
			p.setRed(255 - p.getRed());
			p.setGreen(255 - p.getGreen());
			p.setBlue(255 - p.getBlue());
			p.setAlpha(255 - p.getAlpha());
		}
	}
	public void grayscale() {
		for(Pixel p : getPixels()) {
			int value = (p.getRed() + p.getGreen() + p.getBlue() + p.getAlpha())/4;
			p.setColor(new Color(value, value, value, value));
		}
	}
	public void fixUnderwater() {
		for(Pixel p : getPixels()) {
			if(p.getBlue() > p.getGreen()) {
				p.setBlue(p.getBlue()*2);
			}
		}
	}
	/** Method that mirrors the picture around a 
		* vertical mirror in the center of the picture
		* from left to right */
	public void mirrorVertical()
	{
		Pixel[][] pixels = this.getPixels2D();
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int width = pixels[0].length;
		for (int row = 0; row < pixels.length; row++)
		{
			for (int col = 0; col < width / 2; col++)
			{
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][width - 1 - col];
				rightPixel.setColor(leftPixel.getColor());
			}
		} 
	}
	public void mirrorVerticalRightToLeft()
	{
		Pixel[][] pixels = this.getPixels2D();
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int width = pixels[0].length;
		for (int row = 0; row < pixels.length; row++)
		{
			for (int col = 0; col < width / 2; col++)
			{
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][width - 1 - col];
				leftPixel.setColor(rightPixel.getColor());
			}
		} 
	}
	public void mirrorHorizontal()
	{
		Pixel[][] pixels = this.getPixels2D();
		Pixel topPixel = null;
		Pixel bottomPixel = null;
		int height = pixels.length;
		for (int row = 0; row < pixels.length/2; row++)
		{
			for (int col = 0; col < pixels[row].length; col++)
			{
				topPixel = pixels[row][col];
				bottomPixel = pixels[height - 1 - row][col];
				bottomPixel.setColor(topPixel.getColor());
			}
		} 
	}
	public void mirrorHorizontalBottomToTop()
	{
		Pixel[][] pixels = this.getPixels2D();
		Pixel topPixel = null;
		Pixel bottomPixel = null;
		int height = pixels.length;
		for (int row = 0; row < pixels.length/2; row++)
		{
			for (int col = 0; col < pixels[row].length; col++)
			{
				topPixel = pixels[row][col];
				bottomPixel = pixels[height - 1 - row][col];
				topPixel.setColor(bottomPixel.getColor());
			}
		} 
	}
	public void mirrorDiagonal() {
		Pixel[][] pixels = this.getPixels2D();
		for(int i = 0; i < pixels.length && i < pixels[i].length; i++) {
			for(int j = 0; j < i; j++) {
				pixels[j][i].setColor(pixels[i][j].getColor());
			}
		}
	}
	/** Mirror just part of a picture of a temple */
	public void mirrorTemple()
	{
		int mirrorPoint = 276;
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int count = 0;
		Pixel[][] pixels = this.getPixels2D();
		
		// loop through the rows
		for (int row = 27; row < 97; row++)
		{
			// loop from 13 to just before the mirror point
			for (int col = 13; col < mirrorPoint; col++)
			{
				
				leftPixel = pixels[row][col];			
				rightPixel = pixels[row][2*mirrorPoint - col];
				rightPixel.setColor(leftPixel.getColor());
				count++;
			}
		}
		System.out.println("Temple Count: " + count);
	}
	public void mirrorArms() {
		mirrorSectionVertical(100, 160, 75, 30);
		mirrorSectionVertical(240, 170, 50, 20);
	}
	public void mirrorGull() {
		mirrorSectionHorizontal(230, 230, 120, 90);
	}
	public void mirrorSectionHorizontal(int x, int y, int w, int h) {
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		Pixel[][] pixels = this.getPixels2D();
		int mirrorPoint = x+w;
		for (int row = y; row < y+h; row++)
		{
			for (int col = x; col < mirrorPoint; col++)
			{
				
				leftPixel = pixels[row][col];			
				rightPixel = pixels[row][2*mirrorPoint-col];
				rightPixel.setColor(leftPixel.getColor());
			}
		}
	}
	public void mirrorSectionVertical(int x, int y, int w, int h) {
		int mirrorPoint = y+h;
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		Pixel[][] pixels = this.getPixels2D();
		for (int row = y; row < mirrorPoint; row++)
		{
			for (int col = x; col < x+w; col++)
			{
				
				leftPixel = pixels[row][col];			
				rightPixel = pixels[mirrorPoint - row + mirrorPoint][col];
				rightPixel.setColor(leftPixel.getColor());
			}
		}
	}
	public void flipSectionHorizontal(int x, int y, int w, int h) {
		int right = x+w;
		Pixel[][] pixels = this.getPixels2D();
		for (int top = y; top < y+h; top++) {
			for (int i = x; i < right-x; i++) {
				Pixel leftPixel = pixels[top][x+i];
				Pixel rightPixel = pixels[top][right-i];
				rightPixel.setColor(leftPixel.getColor());
			}
		}
	}
	public void swapSection(int x1, int y1, int x2, int y2, int w, int h) {
		Pixel[][] pixels = getPixels2D();
		for(int y = 0; y < h; y++) {
			for(int x = 0; x < w; x++) {
				Pixel p1 = pixels[y1+y][x1+x];
				Pixel p2 = pixels[y2+y][x2+x];
				Color c1 = p1.getColor();
				Color c2 = p2.getColor();
				p1.setColor(c2);
				p2.setColor(c1);
			}
		}
	}
	
	/** copy from the passed fromPic to the
		* specified startRow and startCol in the
		* current picture
		* @param fromPic the picture to copy from
		* @param startRow the start row to copy to
		* @param startCol the start col to copy to
		*/
	public void copy(Picture fromPic, int startRow, int startCol)
	{
		Pixel fromPixel = null;
		Pixel toPixel = null;
		Pixel[][] toPixels = this.getPixels2D();
		Pixel[][] fromPixels = fromPic.getPixels2D();
		for (int fromRow = 0, toRow = startRow; 
				 fromRow < fromPixels.length &&
				 toRow < toPixels.length; 
				 fromRow++, toRow++)
		{
			for (int fromCol = 0, toCol = startCol; 
					 fromCol < fromPixels[0].length &&
					 toCol < toPixels[0].length;	
					 fromCol++, toCol++)
			{
				fromPixel = fromPixels[fromRow][fromCol];
				toPixel = toPixels[toRow][toCol];
				toPixel.setColor(fromPixel.getColor());
			}
		}	 
	}
	public void copy(Picture fromPic, int fromRowStart, int fromColStart, int fromRowEnd, int fromColEnd, int toRowStart, int toColStart)
	{
		Pixel fromPixel = null;
		Pixel toPixel = null;
		Pixel[][] toPixels = this.getPixels2D();
		Pixel[][] fromPixels = fromPic.getPixels2D();
		for (int fromRow = fromRowStart, toRow = toRowStart;
				 fromRow < fromRowEnd &&
				 toRow < toPixels.length; 
				 fromRow++, toRow++) {
			for (int fromCol = fromColStart, toCol = toColStart; 
					 fromCol < fromColEnd &&
					 toCol < toPixels[0].length;	
					 fromCol++, toCol++) {
				fromPixel = fromPixels[fromRow][fromCol];
				toPixel = toPixels[toRow][toCol];
				toPixel.setColor(fromPixel.getColor());
				System.out.println("Copy pixel");
			}
		}
	}
	public static Picture lossy(Picture p, double factor) {
		double divisor = 1/factor;
		return p.scale(divisor, divisor).scale(factor, factor);
	}
	public static Picture lossy(Picture p, double factor, double increment) {
		Picture result = p;
		for(double i = 1; i < factor; i += increment) {
			result = lossy(result, i);
		}
		return result;
	}

	/** Method to create a collage of several pictures */
	public void createCollage()
	{
		Picture flower1 = new Picture(PictureTester.PATH + "flower1.jpg");
		Picture flower2 = new Picture(PictureTester.PATH + "flower2.jpg");
		this.copy(flower1,0,0);
		this.copy(flower2,100,0);
		this.copy(flower1,200,0);
		Picture flowerNoBlue = new Picture(flower2);
		flowerNoBlue.zeroBlue();
		this.copy(flowerNoBlue,300,0);
		this.copy(flower1,400,0);
		this.copy(flower2,500,0);
		this.mirrorVertical();
		this.write(PictureTester.PATH + "collage.jpg");
	}
	public void myCollage() {
		int height = getHeight();
		int width = getWidth();
		for(int i = 0; i < 10; i++) {
			Picture p = new Picture(PictureTester.PATH + new String[]{"beach.jpg", "arch.jpg", "gorge.jpg"}[Alex.random(3)]);
			switch(Alex.random(3)) {
			case 0 : p.keepOnlyBlue();	break;
			case 1 : p.keepOnlyGreen();	break;
			case 2 : p.keepOnlyRed();	break;
			}
			//Intentionally not calling break;
			switch(Alex.random(4)) {
			case 0 : p.moreJPEG();
			case 1 : p.grayscale();
			case 2 : p.negate();
			case 3 : p.mirrorDiagonal();
			}
			int h = p.getHeight();
			int w = p.getWidth();
			int r = Alex.random(h);
			int c = Alex.random(w);
			int rTo = Alex.random(height);
			int cTo = Alex.random(width);
			this.copy(p, r, c, Alex.random(h - r)+r, Alex.random(w - c)+c, rTo, cTo);
			this.copy(p, Alex.random(height), Alex.random(width));
			//System.out.printf("Copying %s (%d - %d, %d - %d) to (%d, %d)", p.getFileName(), c, c+w, r, r+h, cTo, rTo);
			int x = Alex.random(width);
			int y = Alex.random(height);
			mirrorSectionHorizontal(x, y, Alex.random(width - x), Alex.random(height - y));
		}
		this.write(PictureTester.PATH + "myCollage.jpg");
	}
	
	
	/** Method to show large changes in color 
		* @param edgeDist the distance for finding edges
		*/
	public void edgeDetectionHorizontal(int edgeDist)
	{
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		Pixel[][] pixels = this.getPixels2D();
		Color rightColor = null;
		for (int row = 0; row < pixels.length; row++)
		{
			for (int col = 0; 
					 col < pixels[0].length-1; col++)
			{
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][col+1];
				rightColor = rightPixel.getColor();
				if (leftPixel.colorDistance(rightColor) > 
						edgeDist)
					leftPixel.setColor(Color.BLACK);
				else
					leftPixel.setColor(Color.WHITE);
			}
		}
	}
	public void edgeDetectionVertical(int edgeDist)
	{
		Pixel upPixel = null;
		Pixel downPixel = null;
		Pixel[][] pixels = this.getPixels2D();
		Color downColor = null;
		for (int row = 0; row < pixels.length-1; row++)
		{
			for (int col = 0; 
					 col < pixels[0].length; col++)
			{
				upPixel = pixels[row][col];
				downPixel = pixels[row+1][col];
				downColor = downPixel.getColor();
				if (upPixel.colorDistance(downColor) > 
						edgeDist)
					upPixel.setColor(Color.BLACK);
				else
					upPixel.setColor(Color.WHITE);
			}
		}
	}
	public void edgeDetectionCustom(int edgeDist)
	{
		Pixel[][] pixels = this.getPixels2D();
		for (int row = 0; row < pixels.length-1; row++)
		{
			for (int col = 0; 
					 col < pixels[0].length-1; col++)
			{
				Pixel leftUpPixel = pixels[row][col];
				Color leftUpColor = leftUpPixel.getColor();
				Pixel rightDownPixel = pixels[row+1][col+1];
				Color rightDownColor = rightDownPixel.getColor();
				if (
						Math.abs(leftUpColor.getRed() - rightDownColor.getRed()) > edgeDist ||
						Math.abs(leftUpColor.getGreen() - rightDownColor.getGreen()) > edgeDist ||
						Math.abs(leftUpColor.getBlue() - rightDownColor.getBlue()) > edgeDist
						) {
					/*
					if(leftUpColor.getRed() + leftUpColor.getGreen() + leftUpColor.getBlue() > rightDownColor.getRed() + rightDownColor.getGreen() + rightDownColor.getBlue()) {
						leftUpPixel.setColor(Color.WHITE);
					} else {
						leftUpPixel.setColor(Color.BLACK);
					}
					*/
					leftUpPixel.setColor(Color.BLACK);
				} else {
					leftUpPixel.setColor(Color.WHITE);
				}
			}
		}
	}
	
	//The JPEG stands for Java Photographic Elimination Gauntlet
	public void moreJPEG() {
		moreJPEG(1);
	}
	public void moreJPEG(int x, int y, int w, int h) {
		moreJPEG(x, y, w, h, 1);
	}
	public void moreJPEG(int range) {
		for(Pixel p : getPixels()) {
			p.setBlue(p.getBlue() + Alex.random(range*2)-range);
			p.setRed(p.getRed() + Alex.random(range*2)-range);
			p.setGreen(p.getGreen() + Alex.random(range*2)-range);
		}
		System.out.println("MORE");
	}
	public void moreJPEG(int x, int y, int w, int h, int range) {
		Pixel[][] pp = getPixels2D();
		for(int r = y; r < y+h; r++) {
			for(int c = x; c < x+w; c++) {
				Pixel p = pp[r][c];
				p.setBlue(p.getBlue() + Alex.random(range*2)-range);
				p.setRed(p.getRed() + Alex.random(range*2)-range);
				p.setGreen(p.getGreen() + Alex.random(range*2)-range);
			}
		}
		System.out.println(
				"MORE" + "\n" +
				"X: " + x + "\n" +
				"Y: " + y + "\n" +
				"W: " + w + "\n" +
				"H: " + h + "\n"
				);
	}
	/* Main method for testing - each class in Java can have a main 
	 * method 
	 */
	public static void main(String[] args) 
	{
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.zeroBlue();
		beach.explore();
	}
	
} // this } is the end of class Picture, put all new methods before this
