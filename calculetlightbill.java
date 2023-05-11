import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
    int unit,ret;
    Scanner ob=new Scanner(System.in);
    System.out.print("enter number :");
    unit=ob.nextInt();
    if(unit<=50)
    {
        
        System.out.println(" Free Sevirse ");
    }else if(unit<=200)
    {
       ret= 5*(unit-50);
       System.out.println("bill ret = "+ret);
    }else if(unit<=500)
    {
        ret=unit*8-200*5-50*0;
        System.out.println("bill retis = "+ret);
    }else{
        System.out.println(" all price");
    }
    
    }
}