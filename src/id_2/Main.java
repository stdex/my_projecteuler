package id_2;

public class Main {

	/**
	 * @param args
	 * 
	 */
	
	/*
	 * ������� ����� ���� ������ ��������� ���� ���������, ������� �� ��������� ������ ��������.
	 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int next = 1;
		int last = 0;
		int sum = 0;
		int temp = 0;
		
		while(last < 4000000) // ��������� �� ������ ���� ������� �������
		   {
			if(last%2==0) {
				temp = temp + last;
			}
		// System.out.println(last+" "); // ����� ���������� �����
		   sum = next + last; // �������� ���� ��������� ������
		   next = last; // ���������� ��������������
		   last = sum; // � ���������� ������
		   }
		
		System.out.println("Sum:"+ temp);
		            
			
			
	}
	
	
}