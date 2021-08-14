import java.util.Scanner;
public class Kadai05_03
{
	static int function(int n)
	{
		int sum = 0;
		for(int i = 0; i < n; i++)
		{
			sum += (i + 1);
		}
		return sum;
	}
	public static void main(String[] args)
	{
		System.out.print("値を入力：");
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int sum = function(n);
		System.out.println("1から" + n + "までの和：" + sum);
	}
}
