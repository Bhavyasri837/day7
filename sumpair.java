import java.util.*;
public class sumpair {
    public static void main(String args[])
    {
    int arr[]={1,8,12,16,18,20,25};
    Scanner sc=new Scanner(System.in);
    int k=sc.nextInt();
    int n=arr.length;
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            if((arr[i]+arr[j])==k)
            {
                System.out.println("TRUE");
            }
        }
             
    }
}
}
    
