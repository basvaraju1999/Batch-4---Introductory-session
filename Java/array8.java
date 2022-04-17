import java.util.Scanner;
public class array8 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] a = new int[size];
        int sum=0;
        boolean add = true;
        for(int i = 0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0; i<a.length;i++)
        {
    
            if(a[i] != 6 && add==true)
                sum = sum+a[i];
            else if(a[i] == 6){
                if((i+1) == a.length)
                    sum = sum+a[i];
                else
                    add = false;
            }
            else if(a[i] == 7)
                add = true;
        }
        System.out.println(sum);
    }
}
