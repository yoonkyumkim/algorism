package question;

public class Two {

	/**
	 * @param args
	 * �Ǻ���ġ ������ �� ���� �ٷ� ���� �� �� ���� ���� ���� �˴ϴ�. 
	 * 1�� 2�� �����ϴ� ��� �� ������ �Ʒ��� �����ϴ�.

		1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
		¦���̸鼭 4�鸸 ������ ��� ���� ���ϸ� �󸶰� �˴ϱ�?
	 */
	public static void main(String[] args) {
		int num = 0;
		int save = 1;
		int result = 0;
		for(int i = 0; i < 4000000; i=num) {
			num = i + save; 
			save = i; 
			if(num % 2 == 0) {
				result += num;
			}
		}
		System.out.println(result);
	}

}
