
public class Exersise {
	public static boolean isAutomorphic(int n) {
		// if n * n =  ends in n.
		
		int number = n * n;
		System.out.println(number);
		
		String num = Integer.toString(n);
		String square = Integer.toString(number);
		
		if(square.endsWith(num)) {
			System.out.println("True");
			return true;
		}
		
		else {
			System.out.println("false");
			return false;
		}
		
		




		
}
}
