public class MixedNumber extends Rational{
	private long lNum;
	private Rational rNum;

	public MixedNumber(){
		lNum = 0;
		rNum = new Rational(0, 1);
	}

	public MixedNumber(long i, long n, long d){
		lNum = i + (n / d);
		rNum = new Rational((n % d), d);
	}

	public MixedNumber(long i, Rational r){
		lNum = i + (r.getNumerator() / r.getDenominator());
		rNum = new Rational((r.getNumerator() % r.getDenominator()), r.getDenominator());
	}

	public long getLNum(){
		return lNum;
	}

	public Rational getRNum(){
		return rNum;
	}

	public MixedNumber add(MixedNumber m){
		long addLNum = lNum + m.lNum;
		Rational addRNum = rNum.add(m.rNum);
		return new MixedNumber(addLNum, addRNum);
	}

	public MixedNumber subtract(MixedNumber m){
		Rational temp1 = new Rational((m.rNum.getDenominator() * m.lNum + m.rNum.getNumerator()), (m.rNum.getDenominator()));
		Rational temp2 = new Rational((rNum.getDenominator() * lNum + rNum.getNumerator()), (rNum.getDenominator()));
		return (new MixedNumber(0, (temp2.subtract(temp1))));
	}

	public MixedNumber multiply(MixedNumber m){
		Rational firstL = new Rational(lNum, 1);
		Rational first = firstL.add(rNum);
		Rational secondL = new Rational(m.lNum, 1);
		Rational second = secondL.add(m.rNum);
		Rational result = first.multiply(second);
		return (new MixedNumber(0, result));
	}

	public MixedNumber divide(MixedNumber m){
		Rational firstL = new Rational(lNum, 1);
		Rational first = firstL.add(rNum);
		Rational secondL = new Rational(m.lNum, 1);
		Rational second = secondL.add(m.rNum);
		Rational result = first.divide(second);
		return (new MixedNumber(0, result));
	}

	@Override
	public String toString(){
		return (lNum + " " + rNum);
	}

	public Rational convert(){
		return (new Rational((rNum.getDenominator() * lNum + rNum.getNumerator()), (rNum.getDenominator())));
	}

}