import java.util.Scanner;
class Odd
{
  public static void main(String arr[])
  {
    int num;
    Scanner ob=new Scanner(System.in);
    System.out.print("enter a no=");
    num=ob.nextInt();
    if(num%2==0)
    {
        System.out.println("number is evan");
    }else
    {
        System.out.print("number is odd");
    }
  }
}