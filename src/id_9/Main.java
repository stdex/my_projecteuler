package id_9;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=0, b=0, c=0;
		for(a=1; a<500; a++) {
			for(b=1; b<500; b++) {
				for(c=1; c<500; c++) {
					
					if( (a*a+b*b==c*c) && (a+b+c==1000) && (a<b) && (b<c) ) {
						System.out.println(a*b*c);
					}
				}
			}
		}
			

	}

}
