package Level07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class No4_1157 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String word = sc.nextLine().toUpperCase();
		Map<Character, Integer> map = new HashMap<>();
		Iterator<Character> keys = map.keySet().iterator();
		
		int[] cnt = new int[word.length()];
		
		for(int i=0; i<word.length(); i++) {
			char r = word.charAt(i);	
			
			if(map==null) {
				map.put(r, 1);
			}else {
				while(keys.hasNext()) {
					Character key = keys.next();
					if(key==r) {
						map.put(r, cnt+1);
					}else {
						map.put(r, 1);
					}
				}
			}
		}
		
	}
	
}
