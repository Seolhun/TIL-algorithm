import java.util.Scanner;

public class _1316 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		
		int cnt2 = 0;
		while (cnt > 0) {
			String str = sc.next();
			char[] array = new char[100];
			int arrayIndex = 0;
			boolean isSuccess = true;
			
			for (int i = 0; i < str.length(); i++) {
				char value = str.charAt(i);

				if (i == 0) {
					array[arrayIndex] = value;
				}
				else if (value != array[arrayIndex]) {
					boolean isChk = true;
					for (int j = 0; j < array.length; j++) {
						if (array[j] == '\u0000') break;
						
						if (array[j] == value) {
							isChk = false;
							break;
						}
					}
					
					if (isChk) {
						array[++arrayIndex] = value;
					}
					else {
						isSuccess = false;
						break;
					}
				}
			}
			
			if (isSuccess) {
				cnt2++;
			}
			cnt--;
		}
		System.out.println(cnt2);
	}
}