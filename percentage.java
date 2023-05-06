import java.util.Scanner;
class Percentage{
    public static void main(String arr[])
    {
        float hindi,english,math,total,percentage;
        Scanner ob=new Scanner(System.in);
        System.out.print("enter hindi marks");
        hindi=ob.nextFloat();
        System.out.print("enter english marks");
        english=ob.nextFloat();
        System.out.print("enter math number");
        math=ob.nextFloat();
        total=hindi+english+math;
        percentage=total*100/300;
        System.out.print("total marks is="+total);
        System.out.print("percentage="+percentage);
    }
}