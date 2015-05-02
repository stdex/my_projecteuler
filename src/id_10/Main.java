package id_10;

import java.util.Arrays;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N=2000000, i, j;
		long s=0L;
		boolean[] isPrime;
		isPrime = new boolean[N];
		
		Arrays.fill(isPrime,true); 
		isPrime[1] = false; 
		for (i=2; i*i < N; i++) 
		   if (isPrime[i]) 
		      for (j=i*i; j < N; j+=i) 
		         isPrime[j] = false;
		
		for(i=0;i<N;i++)
			if (isPrime[i] == true) { 
				s=s+i;
				//System.out.println(i);
			}
		
		System.out.println(s);
		
	}

}
