import java.util.Scanner;
class Main{
	public static void main (String[] args){
      int fact = 1;
       Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for(int i = 1; i<=n;i++)
      {
                 fact *= i;
      	}
      System.out.println(fact);
}
}