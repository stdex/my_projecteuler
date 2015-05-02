package id_5;

public class Main {

	/**
	 * @param args
	 */
	
	/*
	 * 
	 * 2520 - самое маленькое число, которое делится без остатка на все числа от 1 до 10.
	 * Какое самое маленькое число делится нацело на все числа от 1 до 20?
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i, j, k=0;
		
		for(i=1; i<999999999; i++) {
			for (j=1; j<=20; j++) {
				if(i%j == 0) { k=k+1; } 
				else { k=0; break; }
				if(k==20) System.out.println(i);
			}
			
		}
		
		

	}

}
