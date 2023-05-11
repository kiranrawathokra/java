import java.util.Scanner;
class Demo
{
    public static void main(String arr[])
    {
        int num;
        Scanner ob=new Scanner(System.in);
        System.out.print("enter number");
        num=ob.nextInt();
        if(num>=1)
        {
            System.out.println("positiv number is=");
        }else if(num<1)
        {
            System.out.println("negativ number is=");
        }else{
            System.out.println("Zero");
        }

    }
}