import java.util.Scanner;
public class flowcontrolstatements16 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int reverse=0;
        int digit;
        while(num!=0)
        {
            digit=num%10;
            reverse=reverse*10+digit;
            num= num/10;
        }
        System.out.println(reverse);
    }
}
