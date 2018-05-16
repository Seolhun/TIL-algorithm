package Q1475;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 메모리: 10976 KB	/ 시간: 84 MS
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String noRoom = br.readLine();
		
		int[] num = new int[10];
		for (int i = 0; i < noRoom.length(); i++) {
			num[noRoom.charAt(i) - '0']++;
		}
		
		int sum = num[6] + num[9];
        if (sum % 2 == 0) {
        	num[6] = num[9] = sum / 2;
        } else {
        	num[6] = num[9] = sum / 2 + 1;
        }

        int cnt = 0;
        for (int i : num) {
        	cnt = Math.max(cnt, i);
        }
        System.out.println(cnt);
	}
}