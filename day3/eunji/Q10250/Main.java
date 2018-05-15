/**
 * 
 */
package algor.acmicpc.step8.q10250;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author tildev
 * @date 2018. 5. 14.
 */
// Q10250 ACM 호텔
// 메모리 / 시간 :
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String t = br.readLine();
		int tNum = Integer.valueOf(t);
		// 층수, 방수, 몇 번째 손님인가
		String[] hwnS = new String[3];
		int h = 0;
		int n = 0;

		int x = 0;
		int y = 0;
		for (int i = 0; i < tNum; i++) {
			t = br.readLine();
			hwnS = t.split(" ");
			h = Integer.valueOf(hwnS[0]);
			n = Integer.valueOf(hwnS[2]);

			y = n % h;
			x = n / h + 1;

			System.out.println((y * 100 + x));
		}
	}
}
