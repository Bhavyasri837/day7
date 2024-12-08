import java.util.*;
public class twopointer1 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int arr[]={1,8,12,16,18,20,25};
        int l=0;
        int h=arr.length-1;
        boolean g=false;
        while(l<=h)
        {
            int sum=arr[l]+arr[h];
            if(sum==k)
            {
                g=true;
                break;
            }
            else if(sum<k)
            l++;
            else
            h--;
        }
        System.out.println(g);
    }
}