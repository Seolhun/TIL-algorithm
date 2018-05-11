package Level07;

import java.util.Scanner;

public class No2_10809 {

	public static void main(String[] args) {

		char alpa = 'a';

		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();

		int[] output = new int[26];

		while (alpa <= 'z') {
			for (int i = 0; i < input.length(); i++) {

				if (alpa == input.charAt(i)) {
					output[(int) (alpa - 97)] = input.indexOf(alpa);

					break;

				} else {
					output[(int) (alpa - 97)] = -1;
				}
			}
			alpa++;
		}

		for (int i = 0; i < 26; i++) {
			System.out.print(output[i]);
			if(i!=25) {
				System.out.print(" ");				
			}
		}

	}
}
