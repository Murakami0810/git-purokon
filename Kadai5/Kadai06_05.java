//import Java.io.IOException;
import java.util.Random;
import java.util.Scanner;
public class Kadai06_05
{
	static int function(int a, int b)
	{
		return 0;
	}
	public static void main(String[] args)
	{
		
		int k = 0;
		Scanner stdIn = new Scanner(System.in);
		int[][][] L = 	{
						{	{1,0,0,0},
							{1,0,0,0},
							{1,0,0,0},
							{1,1,1,0}
						},
						{	{1,1,1,1},
							{1,0,0,0},
							{1,0,0,0},
							{0,0,0,0}
						},
						{	{1,1,1,0},
							{0,0,1,0},
							{0,0,1,0},
							{0,0,1,0}
						},
						{	{0,0,0,1},
							{0,0,0,1},
							{1,1,1,1},
							{0,0,0,0}
						}
						};
		for(int i = 0; i < 4; i++)
		{
			for(int j = 0; j < 4; j++)
			{
				if(L[k][i][j]==1)	System.out.print("¡");
				else System.out.print("@");
			}
			System.out.println();
		}
		while(true)
		{
			int turn = stdIn.nextInt();
			if(turn == 2)
			{
				System.out.flush();
				k += 1;
				for(int i = 0; i < 4; i++)
				{
					for(int j = 0; j < 4; j++)
					{
						if(L[k][i][j]==1)	System.out.print("¡");
						else System.out.print("@");
					}
					System.out.println();
				}
			}
		}
	}
}