
/**
 * @author SeolHun
 * @see https://www.acmicpc.net/problem/1181
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

// 메모리 : 20808 KB
// 속도 : 480 MS
public class Main {
    // 1. 최대 값 구하기
    // 2. 최대 길이 안에 TreeSet을 생성해준다.
    // 3. TreeSet은 자동으로 정렬과 중복값을 제거해준다.
    // 4. TreeSet에 정렬된 값을 출력한다.

    static int T;

    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(bf.readLine());

        String[] strArr = new String[T];
        int max = 0;
        for (int i = 0; i < T; i++) {
            String input = bf.readLine();
            if (input.length() > max) {
                max = input.length();
            }
            strArr[i] = input;
        }

        List<TreeSet<String>> listSet = new ArrayList<>();
        for (int i = 0; i < max; i++) {
            listSet.add(i, new TreeSet<>());
        }
        for (String in : strArr) {
            listSet.get(in.length() - 1).add(in);
        }
        for (SortedSet<String> set : listSet) {
            for (String s : set) {
                System.out.println(s);
            }
        }
    }
}

