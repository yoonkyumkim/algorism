package question;

import java.util.ArrayList;
import java.util.Collections;

public class Four {

	/**
	 * @param args
	 * 앞에서부터 읽을 때나 뒤에서부터 읽을 때나 모양이 같은 수를 대칭수(palindrome)라고 부릅니다.

	두 자리 수를 곱해 만들 수 있는 대칭수 중 가장 큰 수는 9009 (= 91 × 99) 입니다.

	세 자리 수를 곱해 만들 수 있는 가장 큰 대칭수는 얼마입니까?
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
