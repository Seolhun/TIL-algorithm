/**
 * 
 */
package algor.baekjoon.seven.maxcntword;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * @author tildev
 * @date 2018. 5. 9.
 */
public class N_1157 {
	//단어 공부
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine().toUpperCase();

		Map<String, Integer> map = new HashMap<>();

		for (int i = 0; i < word.length(); i++) {
			if (map.get(String.valueOf(word.charAt(i))) == null) {
				map.put(String.valueOf(word.charAt(i)), 0);
			} else {
				map.put(String.valueOf(word.charAt(i)), map.get(String.valueOf(word.charAt(i))) + 1);
			}
		}

		boolean dup = false;
		int max = 0;
		String result = null;
		for (String key : map.keySet()) {
			if (max == 0) {
				max = map.get(key);
				result = key;
			} else {
				if (max < map.get(key)) {
					max = map.get(key);
					dup = false;
					result = key;
				} else if (max == map.get(key)) {
					dup = true;
				}
			}
		}
		
		if(dup) {
			System.out.println("?");
		}else {
			System.out.println(result);
		}
	}
}
