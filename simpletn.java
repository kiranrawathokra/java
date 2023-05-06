import java.util.Scanner;
class Demo{
    public static void main(String arr[])
    {
        float time,ret,princ,sympleintrust;
        System.out.println("program calculet simple intrust");
        Scanner ob= new Scanner(System.in);
        System.out.print("enter ret");
        ret=ob.nextFloat();
        System.out.print("enter princ");
        princ=ob.nextFloat();
        System.out.print("enter time");
        time=ob.nextFloat();
        sympleintrust=princ*ret*time/100;
        System.out.print("sympleintrust="+sympleintrust);
        
    }
}