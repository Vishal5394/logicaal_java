package logical;

public class Fibonacci_series {

	public static void main(String[] args) {
		int n1 = 0 , n2 = 1, n3 ;
		int num = 10;
		for (int i = 0; i<= num; i++) {
			n3 = n1 + n2;
			System.out.println("Fabonnacy series = " + n3);
			n1 = n2;
			n2 = n3;
	
		
	}

	}
}
