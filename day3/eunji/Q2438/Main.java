/**
 * 
 */
package algor.acmicpc.step8.q2438;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author tildev
 * @date 2018. 5. 12.
 */
// Q2438 별찍기 - 1
// 메모리 : 11044 KB / 시간 : 96 MS 
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		int num = Integer.valueOf(n);
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < num; i++) {
			str.append("*");
			System.out.println(str.toString());
		}
	}
}
