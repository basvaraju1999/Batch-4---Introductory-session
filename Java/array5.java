import java.util.Arrays;
import java.util.Scanner;

public class array5 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] a=new int[size];
        for(int i=0;i<size;i++)
        {
            a[i]=scan.nextInt();
        }
        Arrays.sort(a);
        System.out.println("min "+a[0]+"  "+a[1]+" max "+a[size-1]+" "+a[size-2]);
    }
}
