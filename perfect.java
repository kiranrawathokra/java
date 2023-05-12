import java.util.Scanner;
class Main{
public static void main (String[] args) {
    {
     int i,num,temp=0,sum=0;
     Scanner ob=new Scanner(System.in);
     System.out.print("enter Number");
     num=ob.nextInt();
     temp=num;
     for(i=1;i<num;i++)
     {
         if(num %i==0)
         sum+=i;
     }if(temp==sum)
     {
         System.out.println("number is perfect");
     }else{
         System.out.println("not perfect");
     }
    }
}
}