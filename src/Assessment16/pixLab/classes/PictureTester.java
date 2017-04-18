package Assessment16.pixLab.classes;
public class PictureTester
{
	final static String PATH = "src\\Unit16\\pixLab\\images\\";
	public static Picture createPicture() {
		return new Picture(PATH + "beach.jpg");
	}
	public static void main(String[] args)
	{
		Picture p = createPicture();
		p.explore();
		for(int i = 0; i < 10; i++) {
			p.blur(10, 10, 250, 250);
		}
		p.explore();
	}
}