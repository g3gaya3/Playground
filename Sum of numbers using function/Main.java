import java.util.Scanner;
import java.lang.Math;
class Main
{
  public static int sqr(int a)
  { int sum = 0;
   for(int i =1;i<=a;i++)
   {
     sum = sum+i;
  }
   return sum;
  }
	public static void main (String[] args)
    {
	Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      System.out.println(sqr(n));
	} 
}