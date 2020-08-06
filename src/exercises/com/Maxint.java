package exercises.com;

public class Maxint {
	public String front3(String str) {
		String front = "";
		String front2 = "";
		for(int i = 0; i < 3; i++) {
		if (str.length() >= 1 && str.length()<= 2) {
			front = (front += str.substring(0, str.length()));
			System.out.println(front + front + front);
			return front + front + front;
		}
		else if (str.length() >= 3) {
			front2 = (front += str.substring(0, 3));
			System.out.println(front2 + front2 + front2);
			return front2 + front2 + front2;
		}

		
	}
		return str;
	}
}
	
	

	
	  

			
			
		

	

