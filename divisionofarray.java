import java.util.*;
public class divisionofarray
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
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            int res=sum/(i+1);
            arr[i]=res;
        }
        System.out.println(Arrays.toString(arr));
    }
}