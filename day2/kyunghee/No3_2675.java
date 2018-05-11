package Level07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class No3_2675 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		
		Map<Integer, String> word = new HashMap<Integer, String>();
		
		for(int i=0; i<t; i++) {
			int r = sc.nextInt();
			String  s = sc.nextLine();
			word.put(r, s);
		}
		
		Iterator<Integer> keys = word.keySet().iterator();
		
		while(keys.hasNext()) {
			Integer key = keys.next();
			String s = word.get(key);
			for(int i=1; i<s.length(); i++) {
				for(int j=0; j<key; j++) {	
					System.out.print(s.charAt(i));					
				}
			}
			System.out.println();
		}
	}
}