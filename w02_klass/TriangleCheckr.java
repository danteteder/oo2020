public class TriangleCheckr { 


	public static int checkValidity(int a, int b, int c) 
	{ 
		// kolmnurga kontroll || on OR
		if (a + b <= c || a + c <= b || b + c <= a) 
			return 0; 
		else
			return 1;
	} 

	public static void main(String args[]) 
	{ 
		//saab muuta seda inputi
		int a = 7, b = 10, c = 5; 

		if ((checkValidity(a, b, c)) == 1) 
			System.out.print("On kolmnurk"); 
		else
			System.out.print("Ei ole kolmnurk"); 
		
	} 
} 