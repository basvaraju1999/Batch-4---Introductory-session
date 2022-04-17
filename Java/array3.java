import java.util.Scanner;
public class array3 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] a=new int[size];
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        
        System.out.println("Enter Element ");
        int num=sc.nextInt();
        boolean found=false;
        int pos=0;
        for(int i=0;i<size;i++)
        {
            if(num==a[i])
            {
                found=true;
                pos=i;
            }
        }
        if(found==true)
        {
            System.out.println("\n "+pos);
        }
        else
        {
            System.out.println("-1");
        }
        scan.close();
    }
}
