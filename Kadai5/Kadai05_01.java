public class Kadai05_01
{
  static double function1(double x)
  {
    double y;
    y = Math.cos(2.0 * x);
    return y;
  }

  static double function2(double x)
  {
    double y;
    y = (Math.cos(x) * Math.cos(x)) - (Math.sin(x) * Math.sin(x));
    return y;
  }
  public static void main(String[] args)
  {
    int i;
    double theta, y1, y2;
    for(i = 0; i <= 360; i += 5)
    {
      theta = Math.toRadians(i);
      y1 = function1(theta);
      y2 = function2(theta);
      System.out.println(i + "¥t" + y1 + "¥t" + y2);
    }
  }
}
