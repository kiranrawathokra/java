import java.util.Scanner;
class Swapp{
    public static void main(String arr[])
    {   
        int a,b,c;
        Scanner ob=new Scanner(System.in);
        System.out.print("enter a value");
        a=ob.nextInt();
        System.out.print("enter b value");
        b=ob.nextInt();
        System.out.print("before swapping");
        System.out.println("a="+a+"\nb="+b);
        c=a;
        a=b;
        b=c;
        System.out.print("after swapping");
        System.out.println("a="+a+"\nb="+b);
    }
}