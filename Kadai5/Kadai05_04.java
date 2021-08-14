import java.util.Random;
import java.util.Scanner;
public class Kadai05_04
{
	static int function(int a, int b)
	{
		if(a > b)
		{
			int c = a;
			a = b;
			b = c;
		}
		Random rand = new Random();
		int num = rand.nextInt(b - a) + a;
		return num;
	}
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		System.out.print("a:");
		int a = stdIn.nextInt();
		System.out.print("b:");
		int b = stdIn.nextInt();
		int ans;
		ans = function(a, b);
		if(a < b)
		System.out.println(a + "から" + b + "の範囲の乱数：" + ans);
		else
		System.out.println(b + "から" + a + "の範囲の乱数：" + ans);
	}
}
