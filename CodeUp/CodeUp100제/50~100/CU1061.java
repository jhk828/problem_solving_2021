import java.util.Scanner;

// 210125
// 1061 : [기초-비트단위논리연산] 비트단위로 OR 하여 출력하기

public class CU1061 {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a | b);
		
		sc.close();
	}
}