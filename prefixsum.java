import java.util.*;
public class prefixsum {
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
        int pre[]=new int[n];
        pre[0]=arr[0];
        for(int i=1;i<n;i++)
        {
            pre[i]=arr[i]+pre[i-1];
        }
        System.out.println(Arrays.toString(pre));
    }
    
}
