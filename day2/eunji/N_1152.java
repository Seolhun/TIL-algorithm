/**
 * 
 */
package algor.baekjoon.seven.wordcnt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author tildev
 * @date 2018. 5. 9.
 */
public class N_1152 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine().toUpperCase();

		StringTokenizer str = new StringTokenizer(word, " ");
		
		System.out.println(str.countTokens());
	}
}
