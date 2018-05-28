package Q2108;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 메모리: 43996 KB / 시간:	428 MS
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] array = new int[Integer.parseInt(br.readLine())];
	
		int sum = 0;
		int min = 0;
		int max = 0;
		
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(br.readLine());
			sum += array[i];
			
			if (i == 0) {
				min = array[i];
				max = array[i];
			} else {
				if (max < array[i]) {
					max = array[i];
				}
				if (min > array[i]) {
					min = array[i];
				}
			}
		}
		
		//산술평균
		System.out.println(Math.round((double)sum / array.length));
		//중앙값, 최빈값
		solution(array);
		//범위
		System.out.println(max - min);
	}
	
	private static void solution(int[] num) {	
		//중앙값
		Arrays.sort(num);
		
		System.out.println(num[num.length / 2]);
		
		//최빈값
		int[] arrayMode = new int[8001];
		for (int i = 0; i < num.length; i++) {
			arrayMode[num[i] + 4000]++;
		}
		
		int max = 0;
		for (int i = 0; i < arrayMode.length; i++) {
			if (max < arrayMode[i]) {
				max = arrayMode[i];
			}
		}
		
		int cnt = 0;
		int mode = 0;
		for (int i = 0; i < arrayMode.length; i++) {
			if (max == arrayMode[i]) {
				cnt++;
				mode = i - 4000;
				
				if (cnt == 2) break;
			}
		}
		System.out.println(mode);
	}
}