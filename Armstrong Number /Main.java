import java.util.Scanner;
import java.lang.Math;
class Main{
	public static void main (String[] args){
      int c=0; int sum =0; int e;
		Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int temp1=n;
      int temp2 = n;
      while(n>0)
      {
        c++;
        n = n/10;
        
	}
for(int i =0; i<c; i++)
{
  e = temp1%10;

  sum += Math.pow(e,c);
 
  temp1=temp1/10;
 
}
     
      if(sum==temp2)
          System.out.println("Armstrong Number");
      else
          System.out.println("Not a Armstrong Number");
}
}