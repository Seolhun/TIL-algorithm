import java.util.Scanner;

public class _2675 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		
		while (cnt > 0) {
			int cnt2 = sc.nextInt();
			String str = sc.next();
			String result = "";
			for (int i = 0; i < str.length(); i++) 
			{
				for (int j = 0; j < cnt2; j++) {
					result += String.valueOf(str.charAt(i));
				}
			}
			System.out.println(result);
			cnt--;
		}
	}
}