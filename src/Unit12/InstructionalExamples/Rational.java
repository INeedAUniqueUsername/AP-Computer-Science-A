package Unit12.InstructionalExamples;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -


//INCOMPLETE_INCOMPLETE_INCOMPLETE_INCOMPLETE_INCOMPLETE_INCOMPLETE_INCOMPLETE_INCOMPLETE_INCOMPLETE_INCOMPLETE_INCOMPLETE_INCOMPLETE_INCOMPLETE_INCOMPLETE
class Rational implements Comparable<Rational>
{
	//add two instance variables
	int numerator;
	int denominator;
	//write two constructors
	public Rational() {
		this(0, 0);
	}
	public Rational(int n, int d) {
		setRational(n, d);
	}
	//write a setRational method
	public void setRational(int n, int d) {
		setNumerator(n);
		setDenominator(d);
	}
	//write  a set method for numerator and denominator
	public void setNumerator(int n) {
		numerator = n;
	}
	public void setDenominator(int d) {
		denominator = d;
	}
	public void add(Rational  other)
	{
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		setRational(
				numerator * other.getDenominator() + other.getNumerator() * denominator,
				denominator * other.getDenominator()
				);
		reduce();
	}

	private void reduce()
	{
		int gcd = gcd(numerator, denominator);
		setRational(numerator/gcd, denominator/gcd);
	}
	public double getValue() {
		return (double) numerator/denominator;
	}
	private int gcd(int numOne, int numTwo)
	{
		int result = 1;
		for(int i = 2; i < Math.min(numOne, numTwo); i++) {
			if(numOne % i + numTwo % i == 0) {
				result = i;
			}
		}
		return result;
	}

	public Object clone ()
	{
		return new Rational(numerator, denominator);
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	public int getNumerator() {
		return numerator;
	}
	public int getDenominator() {
		return denominator;
	}
	
	public boolean equals( Object obj)
	{
		if(obj instanceof Rational) {
			return getValue == ((Rational) obj).getValue();
		}
		return false;
	}

	public int compareTo(Rational other)
	{
		int result = 0;
		double value_this = (double) numerator/denominator;
		double value_other = (double) other.getNumerator()/other.getDenominator();
		if(value_this < value_other) {
			result = -1;
		} else if(value_this == value_other) {
			result = 0;
		} else if(value_this > value_other) {
			result = 1;
		}
		return result;
	}



	
	//write  toString() method
	public String toString() {
		return String.format("%d/%d", numerator, denominator);
	}
}