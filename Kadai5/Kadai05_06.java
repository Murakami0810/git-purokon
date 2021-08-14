//配列aとbの全要素を交換する要素数が等しくない場合は小さい方の要素数分の要素を交換して
import java.util.Scanner;
public class Kadai05_06
{
  //配列a、bの要素を入れ替える
  static int[] function(int[] a, int[] b)
  {
    int num_a = a.length;
    int num_b = b.length;
    if(num_a > num_b) num_a = num_b;
    int[] c = new int[num_a];
    for(int i = 0; i < num_a; i++)
    {
      c[i] = a[i];
      c[i] = b[i];
      b[i] = a[i];
    }
    return(c);
  }

  public static void main(String[] args)
  {
    int[] x = {1,2,3,4};
    int[] y = {5,6,7,8,9};

    int[] z = function(x,y);

    System.out.print("x:");
    for(int i = 0; i < z.length; i++)
    {
      System.out.print(z[i] + " ");
    }

    int[] k = function(y,x);
    System.out.println();
    System.out.print("y:");
    for(int i = 0; i < k.length; i++)
    {
      System.out.print(k[i] + " ");
    }
  }
}
