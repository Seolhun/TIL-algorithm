package algor.acmicpc.step8.q1924;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author tildev
 * @date 2018. 5. 16.
 */
// Q1924
// 메모리/ 시간 : 10996 KB /92 MS
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();

		String xy[] = n.split(" ");
		String day[] = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

		int month[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		int x = Integer.valueOf(xy[0]);
		int y = Integer.valueOf(xy[1]);

		for (int i = 1; i < x; i++) {
			y += month[i-1];
		}
		System.out.println(day[y % day.length]);
	}
}
