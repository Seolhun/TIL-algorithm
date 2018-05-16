package Q1924;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 메모리: 11008 KB / 시간: 88 MS
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] date = br.readLine().split(" ");
		
		int mon = Integer.parseInt(date[0]);
		int day = Integer.parseInt(date[1]);
		int totalDay = day;
		
		for (int i = 1; i < mon; i++) {
			switch (i) {
				case 1: case 3: case 5: case 7: case 8: case 10: case 12:
					totalDay += 31;
					break;
				case 4: case 6: case 9: case 11:
					totalDay += 30;
					break;
				default:
					totalDay += 28;
					break;
			}
		}
		
		switch (totalDay % 7) {
			case 0:
				System.out.println("SUN");
				break;
			case 1:
				System.out.println("MON");
				break;
			case 2:
				System.out.println("TUE");
				break;
			case 3:
				System.out.println("WED");
				break;
			case 4:
				System.out.println("THU");
				break;
			case 5:
				System.out.println("FRI");
				break;
			case 6:
				System.out.println("SAT");
				break;
		}
	}
}