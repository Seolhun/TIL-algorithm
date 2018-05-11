import java.util.Scanner;

public class _1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().trim();	
		String[] array = str.split(" ");
		int cnt = 0;
		
		for (int i = 0; i < array.length; i++) 
		{				
			if (!array[i].equals("")) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}