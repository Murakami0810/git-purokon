//教科書演習7-16参照
import java.util.Scanner;
public class Kadai05_05
{
  static int function(int num, int[] x)
  {
    int min = x[0];
    for(int i = 1; i < (num); i++)
    {
      if(min > x[i])  min = x[i];
    }
    return min;
  }

  public static void main(String[] args)
  {
    Scanner stdIn = new Scanner(System.in);
    System.out.print("要素数：");
    int num = stdIn.nextInt();

    int[] x = new int [num];
    for(int i = 0; i < num; i++)
    {
      System.out.print("x[" + i + "]:");
      x[i] = stdIn.nextInt();
    }

    int min = function(num, x);
    System.out.println("配列の最小値は" + min);
  }
}
