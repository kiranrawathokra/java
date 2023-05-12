import java.util.Scanner;
class Main{
public static void main (String[] args) {
    {
     int i,num,sum=0;
     Scanner ob=new Scanner(System.in);
     System.out.print("enter Number");
     num=ob.nextInt();
     for(i=1;i<=num;i++)
     {
         if(num %i==0)
         sum++;
     }if(sum==2)
     {
         System.out.println("number is prime");
     }else{
         System.out.println("not prime");
     }
    }
}
}