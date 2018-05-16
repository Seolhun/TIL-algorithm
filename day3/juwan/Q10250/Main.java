package Q10250;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 메모리: 11172 KB / 시간: 100 MS
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		
		while (cnt > 0) {
			String[] value = br.readLine().split(" ");
            int h = Integer.parseInt(value[0]);
            int w = Integer.parseInt(value[1]);
            int n = Integer.parseInt(value[2]);

            int layer = n % h;
            int noRoom = n / h;
            
            if (layer == 0) {
            	System.out.println(h + (noRoom >= 10 ? "" : "0") + noRoom);
            } else {
            	System.out.println(layer + (noRoom + 1 >= 10 ? "" : "0") + (noRoom + 1));
            }
			
			cnt--;
		}
	}
}