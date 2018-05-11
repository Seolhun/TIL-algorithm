/**
 * 
 */
package algor.baekjoon.seven.groupword;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/**
 * @author tildev
 * @date 2018. 5. 9.
 */
public class N_1316 {
	public static void main(String[] args) throws IOException {
		//그룹 단어 체커
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();

		int cnt = Integer.valueOf(word);

		int groupWordCnt = 0;
		for (int i = 0; i < cnt; i++) {
			word = br.readLine();
			boolean isGroupWord = true;
			Set<String> groupSet = new HashSet<>();
			char beforeCh = word.charAt(0);
			groupSet.add(String.valueOf(word.charAt(0)));

			for (int j = 1; j < word.length(); j++) {
				if (beforeCh == word.charAt(j)) {
					continue;
				} else {
					if (groupSet.contains(String.valueOf(word.charAt(j)))) {
						isGroupWord = false;
						break;
					} else {
						groupSet.add(String.valueOf(word.charAt(j)));
					}
					beforeCh = word.charAt(j);
				}
			}
			if (isGroupWord) {
				groupWordCnt += 1;
			}
		}
		System.out.println(groupWordCnt);
	}
}
