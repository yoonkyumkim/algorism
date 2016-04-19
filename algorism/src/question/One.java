package question;

public class One {

	/**
	 * @param args
	 * 10보다 작은 자연수 중에서 3 또는 5의 배수는 3, 5, 6, 9 이고, 이것을 모두 더하면 23입니다.

		1000보다 작은 자연수 중에서 3 또는 5의 배수를 모두 더하면 얼마일까요?
	 */
	public static void main(String[] args) {
		int num = 0;
		for(int i = 0; i < 1000; i++) {
			if(i % 3 == 0 || i % 5 == 0) {
				num += i;
			}
		}
		System.out.println(num);
		
	}

}
