package id_7;

import java.util.Arrays;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N=999999, i, j, s=0;
		boolean[] isPrime;
		isPrime = new boolean[N];
		
		Arrays.fill(isPrime,true); 
		isPrime[1] = false; 
		for (i=2; i*i < N; i++) 
		   if (isPrime[i]) 
		      for (j=i*i; j < N; j+=i) 
		         isPrime[j] = false;
		
		for(i=1;i<N;i++)
			if (isPrime[i] == true) { 
				s=s+1;
				if(s==10001) System.out.println("number_"+s +" = " + i);
			}
		
	}

}
