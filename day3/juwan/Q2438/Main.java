package Q2438;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 메모리: 11064 KB / 시간: 96 MS
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < i + 1; j++) {
				sb.append("*");
			}
			sb.append('\n');
		}
		System.out.println(sb.toString());
	}
}