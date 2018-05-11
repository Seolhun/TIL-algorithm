import java.util.Scanner;

public class _2941 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		String[] array = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
		
		for (int i = 0; i < array.length; i++) {
			if (str.contains(array[i])) {
				str = str.replace(array[i], "1");
			}
		}
		System.out.println(str.length());
	}
}