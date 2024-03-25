package fraction;

public class Fraction {

	private int numerator;
	private int denominator;

	public int getNumerator() {
		return numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setNumerator(int n) {
		this.numerator = n;
		simplyfy();
	}

	public void setDenominator(int d) {

		if (d == 0) {
			// error out
			return;
		}
		this.numerator = d;
		simplyfy();
	}
	
	

	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		if (denominator == 0) {
			// error out
		}
		this.denominator = denominator;
		simplyfy();
	}

	private void simplyfy() {
		int gcd = 1;
		int smaller = Math.min(numerator, denominator);
		for (int i = 2; i < smaller; i++) {
			if (numerator % i == 0 && denominator % i == 0) {
				gcd = i;
			}
			numerator = numerator / gcd;
			denominator = denominator / gcd;
		}

	}

	public void print() {
		if (denominator == 0) {
			System.out.println(numerator);
		} else {
			System.out.println(numerator + "/" + denominator);
		}
	}

	public static Fraction add(Fraction f1,Fraction f2) {
		int newNum = f1.numerator * f2.denominator + f1.denominator * f2.numerator;
		int newDen = f1.denominator * f2.denominator;
		Fraction f = new Fraction(newNum, newDen);
		return f;
	}

	
	public void add(Fraction f2) {
		this.numerator = this.numerator * f2.denominator + this.denominator * f2.numerator;
		this.denominator = this.denominator * f2.denominator;
		simplyfy();
	}

	public void multipy(Fraction f2) {
		this.numerator = this.numerator * f2.numerator;
		this.denominator = this.denominator * f2.denominator;
		simplyfy();
	}

}
