
public class Factorial {

	public static void main(String[] args)
	{
 		Factory fact = new Factory();
 		Factory fact1 = new Factory(479001600);
 		System.out.println(fact1.returnFactorial());
		String s1 = fact.returnFactorial(3628800);
		String s2 = fact.returnFactorial(479001600);
		String s3 =  fact.returnFactorial(6);
		String s4 =  fact.returnFactorial(18);
		String s5 =  fact.returnFactorial(1);
		System.out.println(s1+"\n"+ s2+"\n"+s3+"\n"+s4+"\n"+s5);
	}
}
