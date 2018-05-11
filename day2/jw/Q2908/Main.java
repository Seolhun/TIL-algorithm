import java.util.Scanner;

public class _2908 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		String[] numArray = str.split(" ");
		int[] valueArray = new int[2];
		
		for (int i = 0; i < numArray.length; i++) {
			String num = "";
			for (int j = numArray[i].length() - 1; j >= 0; j--) {
				num += numArray[i].charAt(j);
			}
			valueArray[i] = Integer.parseInt(num);
		}
		
		System.out.println(Math.max(valueArray[0], valueArray[1]));
	}
}