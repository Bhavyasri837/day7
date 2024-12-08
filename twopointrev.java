import java.util.*;
public class twopointrev {
    public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
    int l=0;
    int h=n-1;
    int temp;
    while(l<h)
    {
        temp=a[l];
        a[l]=a[h];
        a[h]=temp;
        l++;
        h--;
    }
System.out.println(Arrays.toString(a));
}    
}
