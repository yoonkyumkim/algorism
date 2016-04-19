package question;

import java.util.ArrayList;

public class Three {

	/**
	 * 어떤 수를 소수의 곱으로만 나타내는 것을 소인수분해라 하고, 이 소수들을 그 수의 소인수라고 합니다.
		예를 들면 13195의 소인수는 5, 7, 13, 29 입니다.
		
		600851475143의 소인수 중에서 가장 큰 수를 구하세요.
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
