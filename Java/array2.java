import java.util.Arrays;
import java.util.Scanner;
class array2 {
    public static void main(String[] args)
    {
        int size;
        Scanner scan = new Scanner(System.in);
        size = scan.nextInt();
        int[] a = new int[size];
        for(int i=0;i<size;i++)
        {
            a[i]=scan.nextInt();
        }
        Arrays.sort(a);
        int min=a[0];
        int max=a[size-1];
        System.out.println("max "+max);
        System.out.println("min "+min);

    }
}
