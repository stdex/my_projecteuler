package id_5;

public class Main {

	/**
	 * @param args
	 */
	
	/*
	 * 
	 * 2520 - ����� ��������� �����, ������� ������� ��� ������� �� ��� ����� �� 1 �� 10.
	 * ����� ����� ��������� ����� ������� ������ �� ��� ����� �� 1 �� 20?
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
