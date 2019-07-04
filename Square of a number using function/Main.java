import java.util.Scanner;
import java.lang.Math;
class Main
{
  public static int sqr(int a)
  {
    return a*a;
  }
	public static void main (String[] args)
    {
	Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      System.out.println(sqr(n));
	} 
}