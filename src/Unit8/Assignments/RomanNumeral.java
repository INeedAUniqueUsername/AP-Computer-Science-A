package Unit8.Assignments;


//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class RomanNumeral
{
	private Integer number;
	private String roman;

	private final static int[] NUMBERS= {1000,900,500,400,100,90,
													50,40,10,9,5,4,1};

	private final static String[] LETTERS = {"M","CM","D","CD","C","XC",
												  "L","XL","X","IX","V","IV","I"};

	public RomanNumeral(String str)
	{
		setRoman(str);
	}

	public RomanNumeral(Integer orig)
	{
		setNumber(orig);
	}

	public void setNumber(Integer num)
	{
		number = num;
		roman = "";
		for(int i = 0; i < NUMBERS.length; i++) {
			int n = NUMBERS[i];
			String r = LETTERS[i];
			while(num >= n) {
				num -= n;
				roman += r;
			}
		}
	}

	public void setRoman(String rom)
	{
		roman = rom;
		number = 0;
		/*
		while(rom.length() > 0) {
			for(int i = 0; i < LETTERS.length; i++) {
				int n = NUMBERS[i];
				String r = LETTERS[i];
				if(rom.indexOf(i) == 0) {
					rom = rom.substring(r.length());
					number += n;
					break;
				}
			}
		}
		*/
		for(int i = 0; i < LETTERS.length; i++) {
			int N = NUMBERS[i];
			String R = LETTERS[i];
			while(rom.indexOf(R) == 0) {
				number += N;
				rom = rom.substring(R.length(), rom.length());
			}
		}
	}

	public Integer getNumber()
	{
		return number;
	}

	public String toString()
	{
		return roman + "\n";
	}
}