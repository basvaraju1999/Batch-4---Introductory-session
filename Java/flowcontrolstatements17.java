import java.util.Scanner;
public class flowcontrolstatements17 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String str=scan.next();
        String reversed="";
        for(int i=str.length()-1;i>=0;i--)
        {
            reversed=reversed+str.charAt(i);
        }
        if(str.equals(reversed))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}
