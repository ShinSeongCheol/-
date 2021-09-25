package 문자열;

import java.util.Scanner;
import java.util.StringTokenizer;

public class 콜롱없애기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(sc.next(),":");
		StringBuilder sb = new StringBuilder();
		
		while(st.hasMoreTokens()) {
			sb.append(st.nextToken());
		}
		
		System.out.println(sb);
	}

}
