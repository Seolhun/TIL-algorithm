package Q1181;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int cnt = Integer.parseInt(br.readLine());
		
		HashSet<String> hs = new HashSet<String>();
		for (int i = 0; i < cnt; i++) {
			hs.add(br.readLine());
		}
		
		String[] array = new String[hs.size()];
		hs.toArray(array);
		
		solution(array);
	}
	
	private static void solution(String[] array) {
		Arrays.sort(array);
		Arrays.sort(array, new Comparator<String>() {
			@Override
			public int compare(String str1, String str2) {
				System.out.println("str1: " + str1 + " / str2: " + str2);
				return Integer.compare(str1.length(), str2.length());
			}
		});
		
		for (String word : array) {
			System.out.println(word);
		}
	}
}