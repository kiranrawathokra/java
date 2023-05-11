import java.util.Scanner;
class Demo{
    public static void main(String arr[])
    {
        float percentage;
        Scanner ob=new Scanner(System.in);
        System.out.print("enter percentage");
        percentage=ob.nextFloat();
        if(percentage>60)
        {
            System.out.println("1st divison");
        }else if(percentage<60 && percentage>45)
        {
            System.out.println("2nd divison");
        }else if(percentage<45 && percentage>36)
        {
            System.out.println("3rd divison");
        }else{
            System.out.println("fall");
        }
    }
}