import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {   while(true)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Please enter year");
            int y= sc.nextInt();
            if(y%4==0)
            {
                if(y%100==0)
                {
                    if(y%400==0)
                    {
                        System.out.println(y+" is a leap year");
                    }else System.out.println(y+" is not a leap year");
                }else System.out.println(y+" is a leap year");

            }else System.out.println(y+" is not a leap year");
        }

    }
}