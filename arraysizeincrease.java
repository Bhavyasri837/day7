import java.util.*;
public class arraysizeincrease
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int m=sc.nextInt();
        int newarr[]=new int[m];
        for(int i=0;i<n;i++)
        {
            newarr[i]=arr[i];
        }
        for(int i=n;i<m;i++)
        {
            newarr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(newarr));
    }
}