package question;

import java.util.ArrayList;

public class Three {

	/**
	 * � ���� �Ҽ��� �����θ� ��Ÿ���� ���� ���μ����ض� �ϰ�, �� �Ҽ����� �� ���� ���μ���� �մϴ�.
		���� ��� 13195�� ���μ��� 5, 7, 13, 29 �Դϴ�.
		
		600851475143�� ���μ� �߿��� ���� ū ���� ���ϼ���.
	 */
	public static void main(String[] args) {
		double num = 600851475143.0;
		boolean so = true;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 1; i < num; i++) {
			if(num % i == 0) {
				for(int j = 2; j < i; j++) {
					if(i % j == 0) {
						so = false;
						break;
					}
				}
				if(so){
					System.out.println(i);
					so = true;
				}
			}
		}
	}

}
