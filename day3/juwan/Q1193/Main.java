package Q1193;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int line = Integer.parseInt(br.readLine());
		
		int[][] array = new int[3170][3170];
		
		int cnt = 1;
		
		boolean isUp = true;
		boolean isDown = false;
		
		int n = 0;
		
		for (int i = 0; i < array.length; i++) {
			for (;n < array[i].length; n++) {
				array[i][n] = cnt;
				
				if (array[i][n] == line) {
					System.out.println((i + 1) + "/" + (n + 1));
					return;
				}
				
				cnt++;
				
				if (i == 0) {
					if (isUp) {
						isUp = false;
					}
					else {
						isDown = true;
						break;
					}
				} else if (n == 0) {
					if (isDown) {
						isUp = true;
					}
					break;
				} else if (isUp || isDown) {
					break;
				}
			}
			
			if (isUp) {
				if (isDown) {
					isDown = false;
				}
				else {
					i -= 2;
					n++;
				}
			}
			else if (isDown) {
				n--;
			}
		}
	}
}