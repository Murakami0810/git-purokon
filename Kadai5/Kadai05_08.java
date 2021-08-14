//教科書演習7-20参照
public class Kadai05_08
{
  //a、bの最大値
  static int function(int a, int b)
  {
    if(a > b) return a;
    else      return b;
  }
  //a、b、cの最小値
  static int function(int a, int b, int c)
  {
    int val = 0;
    if(a < b && a < c)      return a;
    else if(b < a && b < c) return b;
    else                    return c;
  }
  //配列a[]の要素の最小値を求める
  static int function(int[] x)
  {
    int min = x[0];
    for(int i = 1; i < (x.length); i++)
    {
      if(min > x[i])  min = x[i];
    }
    return min;
  }

  public static void main(String[] args)
  {
    int[] x = {5,7,1,9,8};
    int a = 4, b = 8,c = 23;
    int p = function(a,b);
    int y = function(a,b,c);
    int z = function(x);
    System.out.println(p);
    System.out.println(y);
    System.out.println(z);
  }
}
