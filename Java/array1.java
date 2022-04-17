import java.util.Scanner;
class array1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int[size];
        int sum=0;
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            sum=sum+arr[i];
        }
        System.out.print("\n"+sum);
        System.out.print("\n"+(sum/size));
    }
}
