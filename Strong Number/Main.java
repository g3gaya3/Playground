import java.util.Scanner;
class Main{
	public static void main (String[] args){
      int fact = 1;
      int sum = 0;
      int e;
       Scanner in = new Scanner(System.in);
      int n = in.nextInt();
     int temp = n;
      while(n>0)
      {
        fact = 1;
        e = n%10;
      for(int i = 1; i<=e;i++)
      {
                 fact *= i;
      	}
    sum = sum+fact;
        n = n/10;
}
      if(sum==temp)
        System.out.println("Yes");
      else
        System.out.println("No");
}
}