/**
 * 
 */
package algor.baekjoon.seven.constant;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author tildev
 * @date 2018. 5. 9.
 */
public class N_2908 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String ab[] = br.readLine().split(" ");

		int a = Integer.valueOf(ab[0]);
		int b = Integer.valueOf(ab[1]);

		int ra = reverseInt(a, ab[0].length());
		int rb = reverseInt(b, ab[1].length());

		if (ra > rb) {
			System.out.println(ra);
		} else {
			System.out.println(rb);
		}
	}
	
	private static int reverseInt(int intValue, int len) {
		int rv = 0;
		for (int i = len; i > 0 ; i--) {
			rv += (intValue % 10) * Math.pow(10, i-1);
			intValue /=10;
		}
		return rv;
	}
}
