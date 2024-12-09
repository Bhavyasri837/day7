import java.util.*;
public class merging {
public static void main(String args[])
{
    int k=0;
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int arr1[]=new int[n];
    int arr2[]=new int[m];
    int temp[]=new int[n+m];
    for(int i=0;i<n;i++)
    {
        arr1[i]=sc.nextInt();
    }
    for(int i=0;i<m;i++)
    {
        arr2[i]=sc.nextInt();
    }
    System.out.println(Arrays.toString(arr1));
    System.out.println(Arrays.toString(arr2));
    for(int i=0;i<n;i++)
    {
        temp[k]=arr1[i];
        k++;
    }
    for(int i=0;i<m;i++)
    {
        temp[k]=arr2[i];
        k++;
    }
    System.out.println(Arrays.toString(temp));
}
}
