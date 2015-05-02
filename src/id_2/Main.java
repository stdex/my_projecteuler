package id_2;

public class Main {

	/**
	 * @param args
	 * 
	 */
	
	/*
	 * Найдите сумму всех чётных элементов ряда Фибоначчи, которые не превышают четыре миллиона.
	 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int next = 1;
		int last = 0;
		int sum = 0;
		int temp = 0;
		
		while(last < 4000000) // результат не должен быть слишком большой
		   {
			if(last%2==0) {
				temp = temp + last;
			}
		// System.out.println(last+" "); // вывод последнего члена
		   sum = next + last; // сложение двух последних членов
		   next = last; // обновление предпоследнего
		   last = sum; // и последнего членов
		   }
		
		System.out.println("Sum:"+ temp);
		            
			
			
	}
	
	
}