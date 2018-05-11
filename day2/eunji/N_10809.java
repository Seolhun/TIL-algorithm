/**
 * 
 */
package algor.baekjoon.seven.alphabet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author tildev
 * @date 2018. 5. 8.
 */
public class N_10809 {
	//알파벳 찾기 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();

		int length = 'z' - 'a' + 1;
		int alphabetArr[] = new int[length];

		for (int i = 0; i < length; i++) {
			alphabetArr[i] = -1;
		}

		for (int i = 0; i < S.length(); i++) {
			if (alphabetArr[S.charAt(i) - 97] == -1) {
				alphabetArr[S.charAt(i) - 97] = i;
			}
		}
		for (int i = 0; i < alphabetArr.length - 1; i++) {
			System.out.print(alphabetArr[i] + " ");
		}
		System.out.print(alphabetArr[alphabetArr.length - 1]);
	}
}