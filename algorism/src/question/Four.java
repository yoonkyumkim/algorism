package question;

import java.util.ArrayList;
import java.util.Collections;

public class Four {

	/**
	 * @param args
	 * �տ������� ���� ���� �ڿ������� ���� ���� ����� ���� ���� ��Ī��(palindrome)��� �θ��ϴ�.

	�� �ڸ� ���� ���� ���� �� �ִ� ��Ī�� �� ���� ū ���� 9009 (= 91 �� 99) �Դϴ�.

	�� �ڸ� ���� ���� ���� �� �ִ� ���� ū ��Ī���� ���Դϱ�?
	 */
	public static void main(String[] args) {
		

		int num = 0;
		StringBuffer sb = new StringBuffer();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 100; i < 1000; i++) {
			for(int j = 100; j < 1000; j++) {
				num = i * j;
				String pal = String.valueOf(num);
				String p = pal.substring(3);
				String p2 = pal.substring(0,3);
				sb.append(p);
				sb.reverse();
				if(p2.equals(sb.toString())){
					list.add(num);
				}
				sb.setLength(0);
			}
			Collections.sort(list);
			
		}
		System.out.println(list);
		
		
		
		
		
	}

}
