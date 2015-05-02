package id_4;

public class Main {

	/**
	 * @param args
	 */
	
	/*
	 * 
	 * �����-��������� � ����� ������ (������ � �����) �������� ���������. ����� ������� �����-���������, ���������� ������������� ���� ����������� ����� � 9009 = 91 x 99.
	 * ������� ����� ������� ���������, ���������� ������������� ���� ���������� �����.
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int otv = 0;
        int[] m = new int[999 * 999]; //� ���� ������� ����� ��� ����������
        int u = 0;
        for (int i = 999; i > 1; --i)
        {
            for (int j = 999; j > 1; --j)
            {
                otv = i * j; // �� ����� ������������
                if (otv == inverse(otv)) // ��������� �� "��������������"
                {
                    m[u] = otv; //����� � ������
                    ++u;        //����������� ������ �������
                    break;      //��������� ����
                }
            }
        }
        otv = m[0];   //���� ����. ������� �������
        for (int i = 1; i < m.length; ++i)
        {
            if (m[i]> otv) otv = m[i];
        }
        System.out.println(otv);

	}
	
	static int inverse(int n) //����� ��� ��������� "���������" ����� - ��� 1234 ������ 4321
    {
        int obr = 0;
        while (n > 0)
        {
            obr = 10 * obr + n % 10;
            n /= 10;
        }
        return obr;
    }
	

}
