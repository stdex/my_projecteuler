package id_3;

public class Main {

	/**
	 * @param args
	 */
	
	/*
	 * 
	 * ������� �������� ����� 13195 - ��� 5, 7, 13 � 29.
	 * ����� ����� ������� �������� ����� 600851475143, ���������� ������� ������?
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        
        long i, sqi;
        long value, large = 600851475143L;
        long max = 0L;

        i   = 2L;
        sqi = 4L; //i*i
        for(value = large; sqi <= value ; sqi +=  2L * i++ + 1L){
            while(value % i == 0L){
                value /= (max=i);
            }
        }

        if(value != 1L && value != large){
            max = value;
        }
        if(max == 0L){
            max = large;
        }
        System.out.println(max);
      

}
	

	
}
