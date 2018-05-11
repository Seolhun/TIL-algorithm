import java.util.Scanner;

public class _10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int[] array = { -1, -1, -1, -1, -1, -1, 
						-1, -1, -1, -1, -1, -1, 
						-1, -1, -1, -1, -1, -1, 
						-1, -1, -1, -1, -1, -1, 
						-1, -1 };
		
		for (int i = 0; i < str.length(); i++) {
			int index = (int)str.charAt(i) - 97;
			if (array[index] == -1) {
				array[index] = i;
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}