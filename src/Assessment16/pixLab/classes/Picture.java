package Assessment16.pixLab.classes;

import java.awt.Color;
import java.awt.image.BufferedImage;

public class Picture extends SimplePicture {
	public Picture() {
		super();
	}

	public Picture(String fileName) {
		super(fileName);
	}

	public Picture(int height, int width) {
		super(width, height);
	}

	public Picture(Picture copyPicture) {
		super(copyPicture);
	}

	public Picture(BufferedImage image) {
		super(image);
	}

	// Assessment 16
	public void blur(int x, int y, int w, int h) {
		Color[][] result = new Color[h][w];
		for (int r = y; r < y + h; r++) {
			for (int c = x; c < x + w; c++) {
				Pixel p = getPixel(c, r);
				int nearbyPixels = 1, nearbyRed = p.getRed(), nearbyGreen = p
						.getGreen(), nearbyBlue = p.getBlue();
				for (Pixel p_nearby : new Pixel[] { getPixel(c + 1, r),
						getPixel(c - 1, r), getPixel(c, r - 1),
						getPixel(c, r + 1), getPixel(c - 1, r - 1),
						getPixel(c + 1, r - 1), getPixel(c - 1, r + 1),
						getPixel(c + 1, r + 1) }) {
					nearbyPixels += 1;
					nearbyRed += p_nearby.getRed();
					nearbyGreen += p_nearby.getGreen();
					nearbyBlue += p_nearby.getBlue();
				}
				nearbyRed /= nearbyPixels;
				nearbyGreen /= nearbyPixels;
				nearbyBlue /= nearbyPixels;
				result[r - y][c - x] = new Color(nearbyRed, nearbyGreen,
						nearbyBlue);
			}
		}
		for (int r = 0; r < h; r++) {
			for (int c = 0; c < w; c++) {
				getPixel(c + x, r + y).setColor(result[r][c]);
			}
		}
	}
}