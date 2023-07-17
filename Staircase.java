package Coin_staircase;
import java.util.Scanner;

public class Staircase {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int n = Sum(a);
		System.out.println(n);
	
}
	public static int Sum(int a)
	{
		int i=0;
		while (a>=a-(i+1))
		{
			a=a-(i+1);
			i++;
		}
		return i;
		
	}
}