/**
 * 
 */
package algor.acmicpc.step8.q1193;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author tildev
 * @date 2018. 5. 12.
 */
// Q1193 분수찾기
// 메모리 / 시간  : 11012 KB	/ 92 MS
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String x = br.readLine();
		int num = Integer.valueOf(x);
		int cnt = 0;
		int remainder = 0;

		while (num > 0) {
			remainder = num;
			cnt = cnt + 1;
			num = num - cnt;
		}

		if (cnt % 2 == 0) {
			System.out.println(remainder + "/" + (cnt - remainder + 1));
		} else {
			System.out.println((cnt - remainder + 1) + "/" + remainder);
		}

	}
}
