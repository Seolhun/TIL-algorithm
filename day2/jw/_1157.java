import java.util.Scanner;

public class _1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().toUpperCase();
		int[] array = new int[26];
		
		for (int i = 0; i < str.length(); i++) {
			array[(int)str.charAt(i) - 65]++;
		}
		
		int max = 0, index = 0;
		boolean isChk = false;
		for (int i = 0; i < array.length; i++) {
			if (max == array[i]) {
				isChk = true;
			}
			else if (max < array[i]) {
				max = array[i];
				index = i;
				isChk = false;
			}
		}
		
		if (isChk) {
			System.out.println("?");
		}
		else {
			System.out.println((char)(65 + index));
		}
	}
}