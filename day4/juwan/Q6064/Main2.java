package Q6064;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 메모리: 13528 KB / 시간: 240 MS
public class Main2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		
		while (cnt > 0) {
			String[] input = br.readLine().split(" ");
			int M = Integer.parseInt(input[0]);
			int N = Integer.parseInt(input[1]);
			int x = Integer.parseInt(input[2]);
			int y = Integer.parseInt(input[3]);
			
			int lcm = lcm(M, N);
			while (x != y && x <= lcm) {
				if (x < y) x += M;
				else y += N;
			}
			
			System.out.println(x != y ? -1 : x);
			cnt--;
		}
	}
	
	private static int lcm(int M, int N) {
		int z = 0, a = M, b = N;
		while (true) {
			z = a % b;
			
			if (z == 0) break;
			
			a = b; b = z;
		}
		
		return (M * N) / b;
	}
}