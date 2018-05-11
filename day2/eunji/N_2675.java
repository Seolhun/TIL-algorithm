/**
 * 
 */
package algor.baekjoon.seven.repeat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author tildev
 * @date 2018. 5. 9.
 */
public class N_2675 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		int sNum = Integer.valueOf(s);
		
		for(int i=0; i<sNum; i++  ) {
			s = br.readLine();
			
			String arr[] = s.split(" ");
			int repeatNum = Integer.valueOf(arr[0]);
			StringBuilder str = new StringBuilder();
			for(int j=0; j<arr[1].length(); j++) {
				for(int k=0; k<repeatNum;k++) {
					str.append(arr[1].charAt(j));
				}
			}
			System.out.println(str.toString());
		}
	}
}
