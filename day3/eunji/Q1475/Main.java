package algor.acmicpc.step8.q1475;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author tildev
 * @date 2018. 5. 16.
 */
// Q1475
//메모리/ 시간 : 10984 KB/ 88 MS
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();

		int rnArr[] = new int[10];
		for (int i = 0; i < n.length(); i++) {
			rnArr[n.charAt(i) - '0']++;
		}

		int sixNine = rnArr[6] + rnArr[9];
		rnArr[6] = sixNine % 2 == 0 ? sixNine / 2 : sixNine / 2 + 1;

		int max = rnArr[0];
		for (int i = 1; i < rnArr.length - 1; i++) {
			if (max < rnArr[i]) {
				max = rnArr[i];
			}
		}
		System.out.println(max);
	}
}
