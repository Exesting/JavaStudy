import java.util.Objects;

public class Fraction extends Number {
	private int numerator;
	private int denominator;

	public Fraction(int numerator, int denominator) {
		setNumerator(numerator);
		setDenominator(denominator);
		reduce();
	}

	@Override
	public int intValue() {
		return numerator/denominator;
	}

	@Override
	public long longValue() {
		return (long)numerator/denominator;
	}

	@Override
	public float floatValue() {
		return (float)numerator/denominator;
	}

	@Override
	public double doubleValue() {
		return (double)numerator/denominator;
	}

	public Fraction add(Fraction number) {
		int newNumerator = this.numerator * number.getDenominator() + number.getNumerator() * this.denominator;
    	int newDenominator = this.denominator * number.getDenominator();
    	Fraction res = new Fraction(newNumerator, newDenominator);
    	res.reduce();
    	return res;
	}

	public Fraction sub(Fraction number) {
    	int newNumerator = this.numerator * number.getDenominator() - number.getNumerator() * this.denominator;
    	int newDenominator = this.denominator * number.getDenominator();
    	Fraction res = new Fraction(newNumerator, newDenominator);
    	res.reduce();
    	return res;
	}

	public Fraction mult(Fraction number) {
		Fraction newFraction = new Fraction(numerator * number.getNumerator(), denominator * number.getDenominator());
    	newFraction.reduce();
    	return newFraction;
	}
	
	public Fraction div(Fraction number) {
		if (number.getNumerator() == 0) {
        	throw new ArithmeticException("Нельзя делить на дробь с числителем 0");
    	}
    	int newNumerator = numerator * number.getDenominator();
    	int newDenominator = denominator * number.getNumerator();
    	Fraction res = new Fraction(newNumerator, newDenominator);
    	res.reduce();
    	return res;
	}

	@Override
	public String toString() {
		return numerator + "/" + denominator;
	}

	public boolean equals(Fraction number) {
		if (numerator == number.getNumerator() && denominator == number.getDenominator()) {
			return true;
		}
		return false;
	}

	public void reduce() {
		int nod = evclide(numerator, denominator);
		numerator = numerator / nod;
		denominator = denominator / nod;
	}

	private int evclide(int a, int b) {
		while (b!=0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public void setDenominator(int denominator) {
		if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть равен 0");
        } else if (denominator < 0) {
            throw new IllegalArgumentException("Знак должен быть только в числителе");
        }
	}

	public int getNumerator() {
		return numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public Fraction negate() {
		Fraction newFraction = new Fraction((-1)*getNumerator(), getDenominator());
		newFraction.reduce();
		return newFraction;
	}

	public boolean isProper() {
  		int xeNumerator = numerator;
  		int xeDenominator = denominator;
  		if (numerator < 0) {
   			xeNumerator *= -1;
  		}
  		if (denominator < 0) {
   			xeDenominator *= - 1;
  		}
  		if (xeNumerator < xeDenominator) {
   			return true;
  		}
  		return false;
 	}

 	public int hashCode() {
 		return Objects.hash(numerator, denominator);
 	}
}