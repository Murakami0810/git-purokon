public class Kadai05_07
{
  static void add_matrix(int[][] x, int[][] y, int[][] z)
  {
    boolean lengx = false, lengy = false;;
    if(x.length == y.length && x.length == z.length)  lengx = true;
    if(x[0].length == y[0].length && x[0].length == z[0].length)  lengy = true;
    System.out.println(lengx);
    System.out.println(lengy);
    if(lengx && lengy)
    {
      for(int i = 0; i < x.length; i++)
        for(int j = 0; j < x[i].length; j++)
          z[i][j] = x[i][j] + y[i][j];
    }
  }
  static void print_matrix(int[][] x)
  {
    for(int i = 0; i < x.length; i++)
    {
      for(int j = 0; j < x[i].length; j++)
        System.out.print(x[i][j] + " ");
      System.out.println();
    }
  }

  public static void main(String[] args)
  {
    int[][] a = {{1,2,3},{4,5,6}};
    int[][] b = {{7,8,9},{7,3,1}};
    int[][] c = new int[2][3];
    add_matrix(a,b,c);

    System.out.println("行列a");
    print_matrix(a);
    System.out.println("行列b");
    print_matrix(b);
    System.out.println("行列c");
    print_matrix(c);
  }
}
