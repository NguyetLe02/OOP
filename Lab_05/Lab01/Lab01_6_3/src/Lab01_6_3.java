import java.util.Scanner;

public class Lab01_6_3 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Height of triangle?");
		int iHeight = keyboard.nextInt();
		
		for(int i=1;i<iHeight*2;i=i+2) {
			for(int j=0 ;j<((iHeight*2-i)/2);j++) System.out.print(" ");
			for(int j=0;j<i;j++) System.out.print("*");
			for(int j=0 ;j<((iHeight*2-i)/2);j++) System.out.print(" ");
			System.out.print("\n");
		}
	}
}
