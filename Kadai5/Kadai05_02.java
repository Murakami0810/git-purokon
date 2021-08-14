import java.util.Scanner;
public class Kadai05_02
{
  static int function(int x, int y, int z)
  {
    int[] a = {x, y, z};
    for(int i = 0; i < 3; i++)
    {
      if(a[0] > a[i]) a[0] = a[i];
    }
    return a[0];
  }

  public static void main(String[] args)
  {
    int[] value = new int[3];
    Scanner stdIn = new Scanner(System.in);
    for(int i = 0; i < 3; i++)
    {
      System.out.print((i+1) + "つ目：");
      value[i] = stdIn.nextInt();
    }
    int p = function(value[0], value[1], value[2]);
    System.out.println("最小値：" + p);
  }
}
