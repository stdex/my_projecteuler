package id_1;

public class Main {

	/**
	 * @param args
	 */
	
	/*
	 * Найдите сумму всех чисел меньше 1000 кратных 3 или 5.
	 * 
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		
		for(int i=1; i<1000; i++) {
			if(i%3==0 || i%5==0) {
				// System.out.println(i);
				sum = sum + i;
				
			}
			
		}
		
		System.out.println("Sum: " + sum);
			
	}

}
