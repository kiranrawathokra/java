import java.util.Scanner;
 class Main
{
    public static void main(String[] args) 
    {
        int num1,num2,num3,num4;
        Scanner ob = new Scanner(System.in);
        System.out.print("enter num1");
        num1=ob.nextInt();
        System.out.print("enter num2");
        num2=ob.nextInt();
        System.out.print("enter num3");
        num3=ob.nextInt();
        System.out.print("enter num4");
        num4=ob.nextInt();
        if(num1>num2)
        {
            if(num1>num3)
            
            {
                if(num1>num4)
            {
                System.out.println("the largest"+num1);
            }
        }
        }
        else if(num2>num1)
        {
            if(num2>num3)
            {
                if(num2>num4)
            {
               System.out.println("the largest"+num2);  
            }
            }
        }
        else if(num3>num1)
        if(num3>num2)
        {
            if(num3>num4)
        
        {
         
         }   System.out.println("the largest="+num3);
        }
        
        else{
            System.out.println("the largest="+num4);
        }
    }
}