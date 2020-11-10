import java.util.*;
public class TestMixedNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MixedNumber m1=new MixedNumber(9,1,2);
		MixedNumber m2=new MixedNumber(6,3,4);
	    System.out.println("m1 is "+m1);
	    System.out.println("m1 is "+m2);
	    System.out.println("m1 + m2 is "+m1.add(m2));
	    System.out.println("m1 - m2 is "+m1.subtract(m2));
	    System.out.println("m1 * m2 is "+m1.multiply(m2));
	    System.out.println("m1 / m2 is "+m1.divide(m2));
	    if(m1.compareTo(m2) >= 0)
	    	System.out.println(m1);
	    else
	    	System.out.println(m2);
	    System.out.println(m1.equals(m2));
	}

}
	