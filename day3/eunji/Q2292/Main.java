/**
 * 
 */
package algor.acmicpc.step8.q2292;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author tildev
 * @date 2018. 5. 12.
 */
// Q2292 벌집
// 메모리 : 11020 KB / 시간 : 88 MS
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		int num = Integer.valueOf(n);
		final int step = 6;
		int cnt = 1;
		int mul = 0;

		while (num > 0) {
			num = num - cnt;
			mul = mul + 1;
			cnt = mul * step;
		}
		System.out.println(mul);
	}
}
