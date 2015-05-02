package id_6;

public class Main {

	/**
	 * @param args
	 */
	
	/*
	 * Найдите разность между суммой квадратов и квадратом суммы первых ста натуральных чисел.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		double S1=0, S2=0;
		
		for(i=1; i<=100; i++) {
			S1=S1+Math.pow((double)i, 2.0);
			S2=S2+i;
		}
		S2 = Math.pow(S2, 2.0);
		
		System.out.println((int)S2-(int)S1);
		
		
	}

}
