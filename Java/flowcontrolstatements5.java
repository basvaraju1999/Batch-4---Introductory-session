import java.util.Scanner;
public class flowcontrolstatements5 
    {
        public static void main(String[] args)
        {
        Scanner sc=new Scanner(System.in);
        char ch =sc.next().charAt(0);
        scanner.close();
        if((ch>=48 && ch<=57) || ch == 45)
        {
            System.out.print("Digit");

        }
        else if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
        {
            System.out.print("Alphabet");
        }
        else
        {
            System.out.print("Special character");

        }
    }

}
