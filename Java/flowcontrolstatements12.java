 import java.util.Scanner;
public class flowcontrolstatements12 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int flag=0;
        int num=sc.nextInt();
        if(num==1)
        {
            System.out.println("not prime or composite");
        }
        if(num==2)
        {
            flag=0;
        }
        else
        {
            for(int i=2;i<=num/2;i++)
            {
                if(num%i==0)
                {
                    flag=1;
                    break;
                }
            }
        }
        if(flag==0)
        {
            System.out.println("Prime");
        }
        else
        {
            System.out.println("Not Prime");
        }
    }
}
