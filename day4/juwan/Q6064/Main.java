package Q6064;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 메모리: 186636 KB / 시간: 1216 MS
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = Integer.parseInt(br.readLine());
		
		while (cnt > 0) {
			String[] input = br.readLine().split(" ");
			int M = Integer.parseInt(input[0]);
			int N = Integer.parseInt(input[1]);
			int x = Integer.parseInt(input[2]);
			int y = Integer.parseInt(input[3]);
			
			System.out.println(solution(M, N, x, y));
			cnt--;
		}
	}
	
	private static int solution(int M, int N, int x, int y) {
		if (M < N) {
			int temp = N;
			N = M;
			M = temp;
			
			temp = y;
			y = x;
			x = temp;
		}
		
		int[][] array = new int[M][2];
		for (int i = 0; i < array.length; i++) {
			array[i][0] = i > 0 && array[i - 1][0] < M ? array[i - 1][0] + 1 : 1;
			array[i][1] = i > 0 && array[i - 1][1] < N ? array[i - 1][1] + 1 : 1;
			
			if (x == array[i][0] && y == array[i][1]) {
				return i + 1;
			}
		}
		
		int k = x + M;
		int gap = M - N;
		
		int y1 = array[x - 1][1];
		while (true) {
			y1 += gap;
			
			if (y1 > N) {
				y1 = y1 % N;
				if (y1 == 0) y1 = N;
			}
			
			int lasty = (M - x) + y1;
			if (lasty > N) {
				lasty = lasty % N;
				if (lasty == 0) lasty = N;
			}
			
			if (y1 == y) return k;
			else if (lasty == N) return -1;
			
			k += M;
		}
	}
}

/*
12	10	9	3
1	1
2	2
3	3
4	4
5	5
6	6
7	7
8	8
9	9
10	10
11	1
12	2
1	3
2	4
3	5
4	6
5	7
6	8
7	9
8	10
9	1  > 11
10	2
11	3
12	4
1	5
2	6
3	7
4	8
5	9
6	10
7	1
8	2
9	3  > 13
10	4
11	5
12	6
1	7
2	8
3	9
4	10
5	1
6	2
7	3
8	4
9	5  > 15
10	6
11	7
12	8
	9
	10
 */