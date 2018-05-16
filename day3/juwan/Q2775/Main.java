package Q2775;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 메모리: 10900 KB / 시간: 92 MS
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		while (cnt > 0) {
			int layer = Integer.parseInt(br.readLine());
			int ho = Integer.parseInt(br.readLine());
			
			switch(ho) {
				case 1:
					sb.append(1);
					break;
				case 2:
					sb.append(layer + ho);
					break;
				default:
					int[][] apt = new int[layer + 1][ho];
					for (int i = 0; i < apt.length; i++) {
						for (int j = 2; j < apt[i].length; j++) {
							if (i == 0) {
								apt[i][j] = j + 1;
							} else {
								int n = 0;
								if (j == 2) {
									n = i + j;
								} else {
									n = apt[i][j - 1];
								}
								apt[i][j] = n + apt[i - 1][j]; 
							}
						}
					}
					sb.append(apt[layer][--ho]);
					break;
			}
			sb.append("\n");
			cnt--;
		}
		System.out.println(sb.toString());
	}
}
/*
    1	2	3	4	5	6	7	8	9	10	11	12	13	14
0	1	2	3	4	5	6	7	8	9	10	11	12	13	14
1	1	3	6	10	15	21	28	36	45	55	66	78	91	105
2	1	4	10	20	35	56	84	120	165	220	286	364	455	560
3	1	5	15	35	70	126	210							
4	1	6	21	56	126	252	462							
5	1	7	28	84	210	462	924							
6	1	8	36	120	330	792	1716
*/					