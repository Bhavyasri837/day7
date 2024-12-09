import java.util.*;
public class merge {
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int arr1[]=new int[n];
    int arr2[]=new int[m];
    for(int i=0;i<n;i++)
    {
        arr1[i]=sc.nextInt();
    }
    for(int i=0;i<m;i++)
    {
        arr2[i]=sc.nextInt();
    }int merge[]=new int[m+n];
    int i=0,j=0,k=0;
    while(i<n&&j<m)
    {
        if(arr1[i]<=arr2[j])
        {
            merge[k]=arr1[i];
            i++;
        }
        else{
            merge[k]=arr2[j];
            j++;
        }
        k++;
    }
    while(i<n)
    {
        merge[k]=arr1[i];
        i++;
        k++;
    }
    while(j<m)
    {
        merge[k]=arr2[j];
        j++;
        k++;
    }
    System.out.println(Arrays.toString(merge));
}    
}
