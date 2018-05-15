/**
 * 
 */
package algor.acmicpc.step8.q2775;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author tildev
 * @date 2018. 5. 16.
 */
// Q2775 
// 메모리 /시간  : 10724 KB /92 MS
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.valueOf(br.readLine());

		int k = 0;
		int n = 0;
		for (int i = 0; i < t; i++) {
			k = 1 + Integer.valueOf(br.readLine());
			n = Integer.valueOf(br.readLine());

			int kn[][] = new int[k][n];

			for (int kv = 0; kv < k; kv++) {
				for (int nv = 0; nv < n; nv++) {
					if (nv == 0) {
						kn[kv][nv] = 1;
					} else if (kv == 0) {
						kn[kv][nv] = nv + 1;
					} else {
						kn[kv][nv] = kn[kv - 1][nv] + kn[kv][nv - 1];
					}
				}
			}
			System.out.println(kn[k - 1][n - 1]);
		}
	}
}
